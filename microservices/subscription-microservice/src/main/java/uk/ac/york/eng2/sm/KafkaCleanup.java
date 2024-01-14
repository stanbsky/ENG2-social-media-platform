package uk.ac.york.eng2.sm;

import io.micronaut.configuration.kafka.streams.event.BeforeKafkaStreamStart;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;

@Singleton
public class KafkaCleanup {

    private final KafkaConfig.Config config;

    public KafkaCleanup(KafkaConfig.Config config) {
        this.config = config;
    }

    @EventListener
    public void execute(BeforeKafkaStreamStart event) {
        if (config.doCleanup()) {
            event.getKafkaStreams().cleanUp();
        }
    }
}
