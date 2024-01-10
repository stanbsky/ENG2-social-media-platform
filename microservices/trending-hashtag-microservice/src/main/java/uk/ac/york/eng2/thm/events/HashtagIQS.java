package uk.ac.york.eng2.thm.events;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import io.micronaut.configuration.kafka.streams.InteractiveQueryService;
import jakarta.inject.Singleton;
import org.apache.kafka.streams.state.KeyValueIterator;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;

import java.util.Collections;
import java.util.Optional;

@Singleton
public class HashtagIQS {

    private final InteractiveQueryService interactiveQueryService;

    public HashtagIQS(InteractiveQueryService interactiveQueryService) {
        this.interactiveQueryService = interactiveQueryService;
    }

    public Multimap<Long, Long> getHashtagCounts() {
        Optional<ReadOnlyKeyValueStore<Long, Long>> storeOptional =
                interactiveQueryService.getQueryableStore("hashtag-counts-store", QueryableStoreTypes.keyValueStore());
        Multimap<Long, Long> counts = MultimapBuilder.treeKeys(Collections.reverseOrder()).arrayListValues().build();
        if (storeOptional.isEmpty()) {
            return counts;
        }
        ReadOnlyKeyValueStore<Long, Long> store = storeOptional.get();
        try (KeyValueIterator<Long, Long> iterator = store.all()) {
            iterator.forEachRemaining(kv -> counts.put(kv.key, kv.value));
        }
        return counts;
    }
}
