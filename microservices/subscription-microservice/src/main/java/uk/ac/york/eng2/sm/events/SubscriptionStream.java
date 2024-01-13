package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.sm.kafkaobjects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

@Factory
public class SubscriptionStream {

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionStream.class);

    @Inject
    SerdeRegistry serdeRegistry;

    @Singleton
    public KStream<UserHashtag, VideoSet> newVideosByHashtag(@SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder) {

        Properties props = builder.getConfiguration();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subscription-microservice");
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");

        // Build stream of user subscriptions and transform it ready for join
        // <userId, Set<HashtagId>> => <HashtagId, userId>
        KStream<Long, Long> userSubscriptions = builder.stream(
                "eng2-subscriptions",
                Consumed.with(Serdes.Long(), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<Long, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        results.add(new KeyValue<>(hashtagId, key));
                    }
                    return results;
                })
                .peek((key, value) -> logger.warn("userSubscriptions: key={}, value={}", key, value));

        // Build stream of new videos and transform it ready for join
        // <videoId, Set<HashtagId>> => <HashtagId, videoId>
        KStream<Long, Long> newVideos = builder.stream(
                "eng2-new-videos",
                Consumed.with(Serdes.Long(), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<Long, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        results.add(new KeyValue<>(hashtagId, key));
                    }
                    return results;
                })
                .peek((key, value) -> logger.warn("newVideos: key={}, value={}", key, value));

        // Inner join new videos and user subscriptions
        // <HashtagId, videoId> + <HashtagId, userId> => <HashtagId, VideoMetadata<userId, hashtagId>>
        ValueJoiner<Long, Long, VideoMetadata> newVideosJoiner = (newVideo, userSubscription) ->
            new VideoMetadata(userSubscription, newVideo);
        KStream<UserHashtag, Long> newVideosByUserHashtag = newVideos
                .join(userSubscriptions, newVideosJoiner, JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(10)),
                StreamJoined.with(Serdes.Long(), Serdes.Long(), Serdes.Long()))
                .peek((key, value) -> logger.warn("afterJoinBeforeGroup: key={}, value={}", key, value))
                .flatMap((key, value) -> {
                    List<KeyValue<UserHashtag, Long>> results = new ArrayList<>();
                    UserHashtag userHashtag = new UserHashtag();
                    userHashtag.setHashtagId(key);
                    userHashtag.setUserId(value.getUserId());
                    results.add(new KeyValue<>(userHashtag, value.getVideoId()));
                    return results;
                })
                .peek((key, value) -> logger.warn("newVideosByUserHashtag: key={}, value={}", key, value));
        newVideosByUserHashtag.to(
                "newVideosByUserHashtag",
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        Serdes.Long()));

        // Aggregates multiple messages like <key, videoId> to a single <key, Set<videoId>>
        Aggregator<UserHashtag, Long, VideoSet> videoAggregator = (key, value, aggregate) -> {
            Set<Long> videos = aggregate.getVideos();
            videos.add(value);
            aggregate.setVideos(videos);
            return aggregate;
        };

        // Group and aggregate messages into a set of videoIds with a composite key of userId and hashtagId
        // <HashtagId, VideoMetadata<userId, hashtagId>> => <<UserId, HashtagId>, Set<videoId>>
        KStream<UserHashtag, VideoSet> newVideoStream = newVideosByUserHashtag
                .groupByKey(Grouped.with(serdeRegistry.getSerde(UserHashtag.class), Serdes.Long()))
                .aggregate(
                        VideoSet::new,
                        videoAggregator,
                Materialized.with(
                        serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)))
                .toStream()
                .peek((key, value) -> logger.warn("newVideoStream: key={}, value={}", key, value));
                newVideoStream.to(
                        "eng2-subscription-videos",
                        Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class)));

        // Build a stream of watched videos and transform it ready for join
        // <UserVideo, Set<HashtagId>> => <UserHashtag, videoId> => <UserHashtag, Set<videoId>>
        KStream<UserHashtag, VideoSet> watchedVideos = builder.stream(
                "eng2-watched-videos",
                Consumed.with(serdeRegistry.getSerde(UserVideo.class), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<UserHashtag,Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        UserHashtag userHashtag = new UserHashtag();
                        userHashtag.setHashtagId(hashtagId);
                        userHashtag.setUserId(key.getUserId());
                        results.add(new KeyValue<>(userHashtag, key.getVideoId()));
                    }
                    return results;
                })
                .groupByKey(Grouped.with(serdeRegistry.getSerde(UserHashtag.class), Serdes.Long()))
                .aggregate(
                        VideoSet::new,
                        videoAggregator,
                        Materialized.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class))).toStream();

        // Join the new videos stream with the watched videos stream, taking the set difference between their VideoSets
        KStream<UserHashtag, VideoSet> newUnwatchedVideosByUserHashtag = newVideoStream
                .leftJoin(watchedVideos,
                        (newVideosSet, watchedVideosSet) -> {
                            newVideosSet.removeAll(watchedVideosSet);
                            return newVideosSet;
                        },
                        JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(10)),
                        StreamJoined.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class),
                                serdeRegistry.getSerde(VideoSet.class)))
                .peek((key, value) -> logger.warn("newUnwatchedVideosByUserHashtag: key={}, value={}", key, value));
        newVideoStream.to(
                "eng2-next-subscription-videos",
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        // Build the GlobalKTable which will be queried by the controller for next videos to watch
        GlobalKTable<UserHashtag, VideoSet> globalUnwatchedVideosTable = builder.globalTable(
                "eng2-next-subscription-videos",
                Materialized.<UserHashtag, VideoSet, KeyValueStore<Bytes, byte[]>>as("next-subscription-videos-store")
                        .withKeySerde(serdeRegistry.getSerde(UserHashtag.class))
                        .withValueSerde(serdeRegistry.getSerde(VideoSet.class))
        );

        return newVideoStream;
    }

}
