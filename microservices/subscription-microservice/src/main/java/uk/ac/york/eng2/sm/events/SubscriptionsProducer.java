package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface SubscriptionsProducer {

    @Topic("eng2-subscriptions")
    void subscribe(@KafkaKey Long userId, Long hashtagId);

//    @Topic("eng2-unsubscribed")
//    void unsubscribe(@KafkaKey Long userId, Long hashtagId);
}
