package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.domain.Video;

@Client("${trending.url:`http://localhost:8081/trending`}")
public interface TrendingClient {

    @Get("/")
    public Iterable<Video> getTrending();
    
}
