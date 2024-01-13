package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.sm.dto.HashtagDTO;
import uk.ac.york.eng2.sm.kafkaobjects.Subscription;
import uk.ac.york.eng2.sm.kafkaobjects.SubscriptionSerde;

import java.time.Duration;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

@Factory
public class SubscriptionStream {

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionStream.class);

    @Inject
    SubscriptionSerde subscriptionSerde;

    @Singleton
    public KStream<Long, Subscription> subscriptionUpdates(ConfiguredStreamBuilder builder) {

        Properties props = builder.getConfiguration();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "subscription-microservice");
        props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, "exactly_once");
        // We set these to avoid hitting "org.apache.kafka.common.config.ConfigException: Please specify a key serde"
        // as a result of Kafka worrying about not knowing serdes after join, before we specify them in .to(...)
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.Long().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.Long().getClass().getName());

        /*ValueJoiner<Subscription, Long, Subscription> allToNewJoiner = (subscription, hashtagId) -> {
            Set<HashtagDTO> hashtags = subscription.getHashtags();
            hashtags.add(new HashtagDTO(hashtagId));
            subscription.setHashtags(hashtags);
            return subscription;
        };*/
        ValueJoiner<Long, Subscription, Subscription> allToNewJoiner = (hashtagId, subscription) -> {
            if(subscription == null) {
                subscription = new Subscription();
                subscription.setHashtags(new HashSet<>());
            }
            Set<HashtagDTO> hashtags = subscription.getHashtags();
            hashtags.add(new HashtagDTO(hashtagId));
            subscription.setHashtags(hashtags);
            logger.warn("allToNewJoiner: hashtagId={}, subscription={}", hashtagId, subscription);
            return subscription;
        };

        KStream<Long, Subscription> subscriptionUpdates = builder.stream(
                "eng2-subscription-updates",
                Consumed.with(Serdes.Long(), subscriptionSerde));
        KStream<Long, Subscription> updatedWithNewSubscriptions = builder.stream(
                "eng2-new-subscriptions",
                Consumed.with(Serdes.Long(), Serdes.Long()))
                .leftJoin(subscriptionUpdates, allToNewJoiner, JoinWindows.ofTimeDifferenceWithNoGrace(Duration.ofSeconds(1)));
//        KStream<Long, Subscription> updatedSubscriptions = builder.stream(
//                "eng2-subscription-updates",
//                        Consumed.with(Serdes.Long(), subscriptionSerde))
//                .join(newSubscriptions, allToNewJoiner, JoinWindows.ofTimeDifferenceWithNoGrace(Duration.ofMinutes(1)));
//                        .toTable(Materialized.<Long, Subscription, KeyValueStore<Bytes, byte[]>>as("eng2-subscriptions-updates")
//                                .withKeySerde(Serdes.Long())
//                                .withValueSerde(subscriptionSerde));
        updatedWithNewSubscriptions.to("eng2-subscriptions-updates", Produced.with(Serdes.Long(), subscriptionSerde));
       return updatedWithNewSubscriptions;
    }

//    @Singleton
//    public KStream<Long, Subscription> subscriptionState(ConfiguredStreamBuilder builder) {
//        KStream<Long, Subscription> stateStream = builder.stream(
//                "eng2-subscriptions-updates",
//                Consumed.with(Serdes.Long(), serdeRegistry.getSerde(Subscription.class)));
//        stateStream.to("eng2-subscription-state", Produced.with(Serdes.Long(), serdeRegistry.getSerde(Subscription.class)));
//        GlobalKTable<Long, Subscription> stateTable = builder.globalTable(
//                "eng2-subscription-state",
//                Materialized.<Long, Subscription, KeyValueStore<Bytes, byte[]>>as("eng2-subscriptions-state-store")
//                        .withKeySerde(Serdes.Long())
//                        .withValueSerde(serdeRegistry.getSerde(Subscription.class)
//                        ));
//        return stateStream;
//    }
}
