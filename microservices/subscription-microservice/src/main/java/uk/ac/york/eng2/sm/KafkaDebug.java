package uk.ac.york.eng2.sm;

import io.micronaut.configuration.kafka.streams.KafkaStreamsFactory;
import io.micronaut.configuration.kafka.streams.event.AfterKafkaStreamsStart;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class KafkaDebug {

    private static final Logger logger = LoggerFactory.getLogger(KafkaDebug.class);
    private static final Logger LOG = LoggerFactory.getLogger(KafkaStreamsFactory.class);

    @EventListener
    public void execute(AfterKafkaStreamsStart event) {
        logger.warn("Kafka Streams logger: {}", LOG.toString());
        logger.warn("Kafka Streams logger is DEBUG enabled: {}", LOG.isDebugEnabled());
        /*KafkaStreams kafkaStreams = event.getKafkaStreams();
        TopologyDescription topologyDescription = kafkaStreams.localThreadsMetadata().stream()
                .flatMap(threadMetadata -> threadMetadata.topology().subtopologies().stream())
                .collect(Collectors.toList())
                .get(0)
                .describe();
        logger.warn("After Kafka Streams topology: {}", topologyDescription);*/
    }
}
