package uk.ac.york.eng2.sm.serializers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import uk.ac.york.eng2.sm.kafkaobjects.Subscription;

import java.util.Map;

public class SubscriptionSerializer implements Serializer<Subscription> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public SubscriptionSerializer() {
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // Configure your serializer if needed
    }

    @Override
    public byte[] serialize(String topic, Subscription data) {
        if (data == null) {
            return null;
        }

        try {
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new IllegalStateException("Error serializing value", e);
        }
    }

    @Override
    public void close() {
        // Close resources if needed
    }
}
