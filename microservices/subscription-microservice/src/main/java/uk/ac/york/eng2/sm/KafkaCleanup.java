package uk.ac.york.eng2.sm;

import io.micronaut.configuration.kafka.streams.event.BeforeKafkaStreamStart;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class KafkaCleanup {

    private static final Logger logger = LoggerFactory.getLogger(KafkaCleanup.class);
    private final KafkaConfig.Config config;

    public KafkaCleanup(KafkaConfig.Config config) {
        this.config = config;
    }

    @EventListener
    public void execute(BeforeKafkaStreamStart event) {
        logger.warn("Checking if Kafka Streams state stores should be cleaned up");
        logger.warn("kafkaConfig: {}", config);
        if (config.doCleanup()) {
            logger.warn("Cleaning up Kafka Streams state stores");
            event.getKafkaStreams().cleanUp();
        }
        logger.warn("Before Kafka Streams topology: {}", event.getKafkaStreams().toString());
    }
}
