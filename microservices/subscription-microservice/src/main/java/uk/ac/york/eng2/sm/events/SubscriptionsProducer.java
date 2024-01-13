package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.sm.kafkaobjects.HashtagSet;

@KafkaClient
public interface SubscriptionsProducer {

    @Topic("eng2-subscriptions")
    void subscribe(@KafkaKey Long userId, HashtagSet hashtags);

}
