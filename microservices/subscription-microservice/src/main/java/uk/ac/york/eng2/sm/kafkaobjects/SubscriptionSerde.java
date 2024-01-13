package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.configuration.kafka.serde.JsonObjectSerde;
import io.micronaut.json.JsonObjectSerializer;
import jakarta.inject.Singleton;

@Singleton
public class SubscriptionSerde extends JsonObjectSerde<Subscription> {

    public SubscriptionSerde(JsonObjectSerializer jsonObjectSerializer) {
        super(jsonObjectSerializer, Subscription.class);
    }
}
