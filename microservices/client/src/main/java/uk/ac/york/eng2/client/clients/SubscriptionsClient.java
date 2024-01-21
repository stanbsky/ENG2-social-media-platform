package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.client.dto.VideoDTO;

@Client("${subscriptions.url:`http://localhost:8082/subscriptions`}")
public interface SubscriptionsClient {

    @Get("/{userId}/hashtag/{hashtagId}")
    public VideoDTO getWatchlist(Long userId, Long hashtagId);
    @Put("/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> subHashtag(Long userId, Long hashtagId);
    @Delete("/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> unsubHashtag(Long userId, Long hashtagId);
    
}
