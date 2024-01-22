package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.dto.Top10DTO;

@Client("${trending.url:`http://localhost:8081/trending`}")
public interface TrendingClient {

    @Get("/")
    public Top10DTO getTrending();

}
