package uk.ac.york.eng2.sm.serializers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import uk.ac.york.eng2.sm.kafkaobjects.Subscription;

import java.util.Map;

public class SubscriptionDeserializer implements Deserializer<Subscription> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public SubscriptionDeserializer() {
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // Configure your deserializer if needed
    }

    @Override
    public Subscription deserialize(String topic, byte[] data) {
        if (data == null) {
            return null;
        }

        try {
            return objectMapper.readValue(data, Subscription.class);
        } catch (Exception e) {
            throw new IllegalStateException("Error deserializing value", e);
        }
    }

    @Override
    public void close() {
        // Close resources if needed
    }
}

