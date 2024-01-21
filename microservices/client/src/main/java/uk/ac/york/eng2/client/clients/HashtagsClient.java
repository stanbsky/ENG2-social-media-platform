package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.domain.Hashtag;

@Client("${hashtags.url:`http://localhost:8080/hashtags`}")
public interface HashtagsClient {

    @Get("/{id}")
    public Hashtag getHashtag(Long id);
    
}
