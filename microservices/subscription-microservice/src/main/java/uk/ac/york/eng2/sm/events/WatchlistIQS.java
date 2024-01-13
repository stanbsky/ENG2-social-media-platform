package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.streams.InteractiveQueryService;
import jakarta.inject.Singleton;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import uk.ac.york.eng2.sm.dto.WatchlistDTO;
import uk.ac.york.eng2.sm.kafkaobjects.UserHashtag;
import uk.ac.york.eng2.sm.kafkaobjects.VideoSet;

import java.util.Optional;

@Singleton
public class WatchlistIQS {

    private final InteractiveQueryService interactiveQueryService;

    public WatchlistIQS(InteractiveQueryService interactiveQueryService) {
        this.interactiveQueryService = interactiveQueryService;
    }

    public WatchlistDTO getWatchlist(UserHashtag userHashtag) {
        Optional<ReadOnlyKeyValueStore<UserHashtag, VideoSet>> storeOptional =
                interactiveQueryService.getQueryableStore(
                        "next-subscription-videos-store",
                        QueryableStoreTypes.keyValueStore());
        if (storeOptional.isEmpty()) {
            return new WatchlistDTO();
        }
        ReadOnlyKeyValueStore<UserHashtag, VideoSet> store = storeOptional.get();
        VideoSet result = store.get(userHashtag);
        if (result == null) {
            return new WatchlistDTO();
        }
        return new WatchlistDTO(result);
    }
}
