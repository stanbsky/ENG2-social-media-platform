package uk.ac.york.eng2.thm.events;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueStore;

import java.time.Duration;

@Factory
public class HashtagCountStream {
    @Inject
    private SerdeRegistry serdeRegistry;

    @Singleton
    public KStream<Long, Long> topHashtagCountStream(ConfiguredStreamBuilder builder) {
        String stateStoreName = "hashtag-counts-store";
        // TODO: adjust window size after testing
        Duration windowSize = Duration.ofMinutes(1);//.ofHours(1);
        String inputTopic = "eng2-hashtag-liked";
        String outputTopic = "eng2-top-hashtags-windowed";

        // TODO: make wrapper classes for HashtagID, HashtagName, and Count
        KStream<Long, Long> stream = builder.stream(inputTopic, Consumed.with(Serdes.Long(), Serdes.Long()));

        // Accept <UserID, HashtagID> and emit <HashtagID, Count>
        Grouped<Long, Long> grouped = Grouped.with(Serdes.Long(), Serdes.Long());
        KTable<Windowed<Long>, Long> countTable = stream
                .map((key, value) -> new KeyValue<>(value, key))
                .groupByKey(grouped)
                .windowedBy(SlidingWindows.ofTimeDifferenceWithNoGrace(windowSize))
                .count();

        KStream<Long, Long> countStream = countTable.toStream().map((key, value) -> new KeyValue<>(key.key(), value));
        countStream.to(outputTopic, Produced.with(Serdes.Long(), Serdes.Long()));

        // Build the GlobalKTable which will be queried by the controller
        // TODO: can we get rid of variable and just call the builder.globalTable() method?
        GlobalKTable<Long, Long> globalCountTable = builder.globalTable(
                outputTopic,
                Materialized.<Long, Long, KeyValueStore<Bytes, byte[]>>as(stateStoreName)
                        .withKeySerde(Serdes.Long())
                        .withValueSerde(Serdes.Long())
        );

        return countStream;
    }


}
