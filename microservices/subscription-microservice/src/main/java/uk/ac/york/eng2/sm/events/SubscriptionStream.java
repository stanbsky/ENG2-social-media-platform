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
import uk.ac.york.eng2.sm.KafkaConfig;
import uk.ac.york.eng2.sm.kafkaobjects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

@Factory
public class SubscriptionStream {

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionStream.class);
    private static final long WINDOW_SIZE = 4L;
    private final KafkaConfig.Topics topics;
    private final KafkaConfig.Stores stores;
    @Inject
    SerdeRegistry serdeRegistry;

    public SubscriptionStream(KafkaConfig.Topics topics, KafkaConfig.Stores stores) {
        this.topics = topics;
        this.stores = stores;
    }

    @Singleton
    public KStream<UserHashtag, VideoSet> newVideosByUserHashtag(@SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder) {

        Properties props = builder.getConfiguration();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subscription-microservice");
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");

        // Create a stream of all videos matching the users' hashtag subscriptions
        KStream<UserHashtag, VideoSet> newVideosByUserHashtag =
                buildNewVideosByUserHashtag(
                        builder,
                        topics.getNewVideos(),
                        topics.getNewSubscriptions());
        newVideosByUserHashtag.to(
                topics.getNewVideosByUserHashtag(),
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        // Create a stream of all videos watched by users
        KStream<UserHashtag, VideoSet> watchedVideos =
                buildWatchedVideosByUserHashtag(
                        builder,
                        topics.getWatchedVideos());
        watchedVideos.to(
                topics.getWatchedVideosByUserHashtag(),
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        // Create a stream of all videos matching hashtag subscriptions which have not been watched by users
        KStream<UserHashtag, VideoSet> newUnwatchedVideosByUserHashtag =
                nextSubscriptionVideos(builder,
                        topics.getNewVideosByUserHashtag(),
                        topics.getWatchedVideosByUserHashtag());
        newUnwatchedVideosByUserHashtag.to(
                topics.getNextSubscriptionVideos(),
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        // Build the GlobalKTable which will be queried by the controller for next videos to watch
        builder.globalTable(
                topics.getNextSubscriptionVideos(),
                Materialized.<UserHashtag, VideoSet, KeyValueStore<Bytes, byte[]>>as("next-subscription-videos-store")
                        .withKeySerde(serdeRegistry.getSerde(UserHashtag.class))
                        .withValueSerde(serdeRegistry.getSerde(VideoSet.class))
        );

        return newUnwatchedVideosByUserHashtag;
    }

    private KStream<UserHashtag, VideoSet> buildNewVideosByUserHashtag(
            ConfiguredStreamBuilder builder,
            String newVideosTopic,
            String newSubscriptionsTopic) {
        // Build table of users subscribed to each hashtag
        // <userId, Set<HashtagId>> => <HashtagId, Set<userId>>
        KTable<Long, UserSet> userSubscriptions = builder.stream(
                        newSubscriptionsTopic,
                        Consumed.with(Serdes.Long(), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<Long, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        results.add(new KeyValue<>(hashtagId, key));
                    }
                    return results;
                }, Named.as("flatmap-to-hashtagId-userId"))
                .peek((key, value) -> logger.warn("userSubscriptions: key={}, value={}", key, value))
                .groupByKey(Grouped.with(Serdes.Long(), Serdes.Long()))
                .aggregate(
                        UserSet::new,
                        (hashtagId, userId, userSet) -> {
                            Set<Long> users = userSet.getUsers();
                            users.add(userId);
                            userSet.setUsers(users);
                            return userSet;
                        },
                        Named.as("aggregate-subscribed-users-to-set-userId"),
                        Materialized.with(
                                Serdes.Long(),
                                serdeRegistry.getSerde(UserSet.class)));

        // Build stream of new videos and transform it ready for join
        // <videoId, Set<HashtagId>> => <HashtagId, videoId>
        KStream<Long, Long> newVideos = builder.stream(
                        newVideosTopic,
                        Consumed.with(Serdes.Long(), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<Long, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        results.add(new KeyValue<>(hashtagId, key));
                    }
                    return results;
                }, Named.as("flatmap-to-hashtagId-videoId"))
                .peek((key, value) -> logger.warn("newVideos: key={}, value={}", key, value));

        // <HashtagId, videoId> + <HashtagId, Set<userId>> => <HashtagId, UsersVideosContainer>
        KStream<Long, UsersVideosContainer> newVideosByHashtag = newVideos
                .join(userSubscriptions,
                        (videoId, users) -> {
                            UsersVideosContainer usersVideosContainer = new UsersVideosContainer();
                            usersVideosContainer.setUsers(users);
                            VideoSet videoSet = new VideoSet();
                            videoSet.add(videoId);
                            usersVideosContainer.setVideos(videoSet);
                            return usersVideosContainer;
                        }, Joined.with(Serdes.Long(), Serdes.Long(), serdeRegistry.getSerde(UserSet.class)))
                .groupByKey(Grouped.with(Serdes.Long(), serdeRegistry.getSerde(UsersVideosContainer.class)))
                .aggregate(
                        UsersVideosContainer::new,
                        (hashtagId, value, aggregate) -> {
                            aggregate.merge(value);
                            return aggregate;
                        },
                        Named.as("aggregate-by-hashtagId-to-usersVideosContainer"),
                        Materialized.with(
                                Serdes.Long(),
                                serdeRegistry.getSerde(UsersVideosContainer.class))).toStream()
                .peek((key, value) -> logger.warn("newVideosByHashtag: key={}, value={}", key, value));

        KStream<UserHashtag, VideoSet> newVideosByUserHashtag = newVideosByHashtag
                .flatMap((hashtagId, usersVideosContainer) -> {
                    List<KeyValue<UserHashtag, VideoSet>> results = new ArrayList<>();
                    for (Long userId : usersVideosContainer.getUsers().getUsers()) {
                        UserHashtag userHashtag = new UserHashtag();
                        userHashtag.setHashtagId(hashtagId);
                        userHashtag.setUserId(userId);
                        results.add(new KeyValue<>(userHashtag, usersVideosContainer.getVideos()));
                    }
                    return results;
                }, Named.as("flatmap-from-hashtagId-userVideosContainer-to-userHashtag-videoSet"))
                .peek((key, value) -> logger.warn("newVideosByUserHashtag: key={}, value={}", key, value));
        return newVideosByUserHashtag;
    }


    //    @Singleton
    private KStream<UserHashtag, VideoSet> buildWatchedVideosByUserHashtag(ConfiguredStreamBuilder builder, String watchedVideosTopic) {

        logger.warn("Starting watchedVideosByUserHashtag");

        // Aggregates multiple messages like <key, videoId> to a single <key, Set<videoId>>
        Aggregator<UserHashtag, Long, VideoSet> videoAggregator = (key, value, aggregate) -> {
            Set<Long> videos = aggregate.getVideos();
            videos.add(value);
            aggregate.setVideos(videos);
            return aggregate;
        };

        // Build a stream of watched videos and transform it ready for join
        // <UserVideo, Set<HashtagId>> => <UserHashtag, videoId> => <UserHashtag, Set<videoId>>
        KStream<UserHashtag, VideoSet> watchedVideos = builder.stream(
                        watchedVideosTopic,
                        Consumed.with(serdeRegistry.getSerde(UserVideo.class), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<UserHashtag, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        UserHashtag userHashtag = new UserHashtag();
                        userHashtag.setHashtagId(hashtagId);
                        userHashtag.setUserId(key.getUserId());
                        results.add(new KeyValue<>(userHashtag, key.getVideoId()));
                    }
                    return results;
                }, Named.as("flatmap-from-userVideo-hashtagSet-to-userHashtag-videoId"))
                .groupByKey(Grouped.with(serdeRegistry.getSerde(UserHashtag.class), Serdes.Long()))
                .aggregate(
                        VideoSet::new,
                        videoAggregator,
                        Named.as("aggregate-by-userHashtag-to-videoSet"),
                        Materialized.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class))).toStream();

        return watchedVideos;
    }

    //    @Singleton
    private KStream<UserHashtag, VideoSet> nextSubscriptionVideos(
            @SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder,
            String newVideosByUserHashtagTopic,
            String watchedVideosByUserHashtagTopic) {

        logger.warn("Starting nextSubscriptionVideos");

        KStream<UserHashtag, VideoSet> newVideosByUserHashtag = builder.stream(
                newVideosByUserHashtagTopic,
                Consumed.with(serdeRegistry.getSerde(UserHashtag.class), serdeRegistry.getSerde(VideoSet.class)));

        // SUBTRACT WATCHED VIDS

        KStream<UserHashtag, VideoSet> watchedVideos = builder.stream(
                watchedVideosByUserHashtagTopic,
                Consumed.with(serdeRegistry.getSerde(UserHashtag.class), serdeRegistry.getSerde(VideoSet.class))
        );

        // Join the new videos stream with the watched videos stream, taking the set difference between their VideoSets
        KStream<UserHashtag, VideoSet> newUnwatchedVideosByUserHashtag = newVideosByUserHashtag
                .leftJoin(watchedVideos,
                        (newVideosSet, watchedVideosSet) -> {
                            newVideosSet.removeAll(watchedVideosSet);
                            return newVideosSet;
                        },
                        JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(WINDOW_SIZE)),
                        StreamJoined.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class),
                                serdeRegistry.getSerde(VideoSet.class)))
                .peek((key, value) -> logger.warn("newUnwatchedVideosByUserHashtag: key={}, value={}", key, value));

        return newUnwatchedVideosByUserHashtag;
    }



    /*
    @Singleton
    public KStream<UserHashtag, VideoSet> removeWatchedVideos(@SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder) {

        // Aggregates multiple messages like <key, videoId> to a single <key, Set<videoId>>
        Aggregator<UserHashtag, Long, VideoSet> videoAggregator = (key, value, aggregate) -> {
            Set<Long> videos = aggregate.getVideos();
            videos.add(value);
            aggregate.setVideos(videos);
            return aggregate;
        };

        // Build a stream of watched videos and transform it ready for join
        // <UserVideo, Set<HashtagId>> => <UserHashtag, videoId> => <UserHashtag, Set<videoId>>
        KStream<UserHashtag, VideoSet> watchedVideos = builder.stream(
                        topics.getWatchedVideos(),
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
                }, Named.as("flatmap-from-userVideo-hashtagSet-to-userHashtag-videoId"))
                .groupByKey(Grouped.with(serdeRegistry.getSerde(UserHashtag.class), Serdes.Long()))
                .aggregate(
                        VideoSet::new,
                        videoAggregator,
                        Named.as("aggregate-by-userHashtag-to-videoSet"),
                        Materialized.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class))).toStream();

        // Build the newVideosByUserHashtag stream
        KStream<UserHashtag, VideoSet> newVideosByUserHashtag = builder.stream(
                        topics.getNewVideosByUserHashtag(),
                        Consumed.with(serdeRegistry.getSerde(UserHashtag.class), serdeRegistry.getSerde(VideoSet.class)));
//                .peek((key, value) -> logger.warn("newVideosByUserHashtag: key={}, value={}", key, value));

        // Join the new videos stream with the watched videos stream, taking the set difference between their VideoSets
        KStream<UserHashtag, VideoSet> newUnwatchedVideosByUserHashtag = newVideosByUserHashtag
                .leftJoin(watchedVideos,
                        (newVideosSet, watchedVideosSet) -> {
                            newVideosSet.removeAll(watchedVideosSet);
                            return newVideosSet;
                        },
                        JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(WINDOW_SIZE)),
                        StreamJoined.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class),
                                serdeRegistry.getSerde(VideoSet.class)))
                .peek((key, value) -> logger.warn("newUnwatchedVideosByUserHashtag: key={}, value={}", key, value));

        newUnwatchedVideosByUserHashtag.to(
//                topics.getNextSubscriptionVideos(),
                topics.getNewVideosByUserHashtag(),
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        // Build the GlobalKTable which will be queried by the controller for next videos to watch
        GlobalKTable<UserHashtag, VideoSet> globalUnwatchedVideosTable = builder.globalTable(
                topics.getNextSubscriptionVideos(),
                Materialized.<UserHashtag, VideoSet, KeyValueStore<Bytes, byte[]>>as("next-subscription-videos-store")
                        .withKeySerde(serdeRegistry.getSerde(UserHashtag.class))
                        .withValueSerde(serdeRegistry.getSerde(VideoSet.class))
        );
        return newUnwatchedVideosByUserHashtag;
    }/*

   /* @Singleton
    public GlobalKTable<UserHashtag, VideoSet> watchlistIQSTable(@SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder) {

        // Build the GlobalKTable which will be queried by the controller for next videos to watch
        GlobalKTable<UserHashtag, VideoSet> globalUnwatchedVideosTable = builder.globalTable(
                topics.getNextSubscriptionVideos(),
                Materialized.<UserHashtag, VideoSet, KeyValueStore<Bytes, byte[]>>as("next-subscription-videos-store")
                        .withKeySerde(serdeRegistry.getSerde(UserHashtag.class))
                        .withValueSerde(serdeRegistry.getSerde(VideoSet.class))
        );
        return globalUnwatchedVideosTable;
    }*/

    /*@Singleton
    public KStream<UserHashtag, VideoSet> pushVideosForNewSubscription(@SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder) {

        Properties props = builder.getConfiguration();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subscription-microservice");
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");

        // Build stream of user subscriptions and transform it ready for join
        // <userId, Set<HashtagId>> => <HashtagId, userId>
        KStream<Long, Long> userSubscriptions = builder.stream(
                        topics.getNewSubscriptions(),
                        Consumed.with(Serdes.Long(), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<Long, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        results.add(new KeyValue<>(hashtagId, key));
                    }
                    return results;
                });
//                .peek((key, value) -> logger.warn("userSubscriptions: key={}, value={}", key, value));

        // Build stream of new videos and transform it ready for join
        // <videoId, Set<HashtagId>> => <HashtagId, videoId>
        KStream<Long, Long> newVideos = builder.stream(
                        topics.getNewVideos(),
                        Consumed.with(Serdes.Long(), serdeRegistry.getSerde(HashtagSet.class)))
                .flatMap((key, value) -> {
                    List<KeyValue<Long, Long>> results = new ArrayList<>();
                    for (Long hashtagId : value.getHashtags()) {
                        results.add(new KeyValue<>(hashtagId, key));
                    }
                    return results;
                });
//                .peek((key, value) -> logger.warn("newVideos: key={}, value={}", key, value));

        // Inner join new videos and user subscriptions
        // <HashtagId, videoId> + <HashtagId, userId> => <HashtagId, VideoMetadata<userId, hashtagId>>
        ValueJoiner<Long, Long, VideoMetadata> newVideosJoiner = (newVideo, userSubscription) ->
                new VideoMetadata(userSubscription, newVideo);
        KStream<UserHashtag, Long> newVideosByUserHashtag = newVideos
                .join(userSubscriptions, newVideosJoiner,
                        JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(WINDOW_SIZE)),
                        StreamJoined.with(Serdes.Long(), Serdes.Long(), Serdes.Long()))
                .peek((key, value) -> logger.warn("afterJoinBeforeGroup: key={}, value={}", key, value))
                .flatMap((key, value) -> {
                    List<KeyValue<UserHashtag, Long>> results = new ArrayList<>();
                    UserHashtag userHashtag = new UserHashtag();
                    userHashtag.setHashtagId(key);
                    userHashtag.setUserId(value.getUserId());
                    results.add(new KeyValue<>(userHashtag, value.getVideoId()));
                    return results;
                });
//                .peek((key, value) -> logger.warn("newVideosByUserHashtag: key={}, value={}", key, value));

        // Group and aggregate messages into a set of videoIds with a composite key of userId and hashtagId
        // <HashtagId, VideoMetadata<userId, hashtagId>> => <<UserId, HashtagId>, Set<videoId>>
        KStream<UserHashtag, VideoSet> videosForNewSubscribers = newVideosByUserHashtag
                .groupByKey(Grouped.with(serdeRegistry.getSerde(UserHashtag.class), Serdes.Long()))
                .aggregate(
                        VideoSet::new,
                        (userHashtag, videoId, aggregate) -> {
                            Set<Long> videos = aggregate.getVideos();
                            videos.add(videoId);
                            aggregate.setVideos(videos);
                            return aggregate;
                        },
                        Materialized.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class)))
                .toStream()
                .peek((key, value) -> logger.warn("videosForNewSubscribers: key={}, value={}", key, value));
        videosForNewSubscribers.to(
                topics.getNewSubSuggestions(),
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        return videosForNewSubscribers;
    }*/

    /*
    // Original implementation
    @Singleton
    public KStream<UserHashtag, VideoSet> newVideosByHashtag(@SuppressWarnings("MnInjectionPoints") ConfiguredStreamBuilder builder) {

        Properties props = builder.getConfiguration();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subscription-microservice");
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");

        // Build stream of user subscriptions and transform it ready for join
        // <userId, Set<HashtagId>> => <HashtagId, userId>
        KStream<Long, Long> userSubscriptions = builder.stream(
                topics.getNewSubscriptions(),
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
                topics.getNewVideos(),
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
                .join(userSubscriptions, newVideosJoiner,
                        JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(WINDOW_SIZE)),
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
                topics.getNewVideosByUserHashtag(),
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
                        topics.getSubscriptionVideosByUserHashtag(),
                        Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class)));

        // Build a stream of watched videos and transform it ready for join
        // <UserVideo, Set<HashtagId>> => <UserHashtag, videoId> => <UserHashtag, Set<videoId>>
        KStream<UserHashtag, VideoSet> watchedVideos = builder.stream(
                topics.getWatchedVideos(),
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
                        JoinWindows.ofTimeDifferenceWithNoGrace(java.time.Duration.ofMinutes(WINDOW_SIZE)),
                        StreamJoined.with(
                                serdeRegistry.getSerde(UserHashtag.class),
                                serdeRegistry.getSerde(VideoSet.class),
                                serdeRegistry.getSerde(VideoSet.class)))
                .peek((key, value) -> logger.warn("newUnwatchedVideosByUserHashtag: key={}, value={}", key, value));
        newVideoStream.to(
                topics.getNextSubscriptionVideos(),
                Produced.with(serdeRegistry.getSerde(UserHashtag.class),
                        serdeRegistry.getSerde(VideoSet.class)));

        // Build the GlobalKTable which will be queried by the controller for next videos to watch
        GlobalKTable<UserHashtag, VideoSet> globalUnwatchedVideosTable = builder.globalTable(
                topics.getNextSubscriptionVideos(),
                Materialized.<UserHashtag, VideoSet, KeyValueStore<Bytes, byte[]>>as("next-subscription-videos-store")
                        .withKeySerde(serdeRegistry.getSerde(UserHashtag.class))
                        .withValueSerde(serdeRegistry.getSerde(VideoSet.class))
        );

        return newVideoStream;
    }
*/
}
