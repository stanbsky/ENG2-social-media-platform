package uk.ac.york.eng2.vms.client.videos;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {
    @Get("/")
    public Iterable<Video> list();
}
