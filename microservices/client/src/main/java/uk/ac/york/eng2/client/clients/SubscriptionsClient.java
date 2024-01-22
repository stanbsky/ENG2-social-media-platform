package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.dto.WatchlistDTO;
import io.micronaut.http.HttpResponse;

@Client("${subscriptions.url:`http://localhost:8082/subscriptions`}")
public interface SubscriptionsClient {

    @Get("/user/{userId}/hashtag/{hashtagId}")
    public WatchlistDTO getWatchlist(Long userId, Long hashtagId);
    @Put("/user/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> subHashtag(Long userId, Long hashtagId);
    @Delete("/user/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> unsubHashtag(Long userId, Long hashtagId);
    
}
