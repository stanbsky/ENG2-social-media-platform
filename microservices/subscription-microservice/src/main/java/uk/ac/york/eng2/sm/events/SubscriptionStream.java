package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.sm.kafkaobjects.HashtagSet;
import uk.ac.york.eng2.sm.kafkaobjects.UserHashtag;
import uk.ac.york.eng2.sm.kafkaobjects.VideoMetadata;
import uk.ac.york.eng2.sm.kafkaobjects.VideoSet;

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
//    public KStream<UserHashtag, Long> newVideosByHashtag(ConfiguredStreamBuilder builder) {

        Properties props = builder.getConfiguration();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subscription-microservice");
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");

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
        Aggregator<UserHashtag, Long, VideoSet> videoAggregator = (key, value, aggregate) -> {
            Set<Long> videos = aggregate.getVideos();
            videos.add(value);
            aggregate.setVideos(videos);
            return aggregate;
        };
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
        return newVideoStream;
    }

}
