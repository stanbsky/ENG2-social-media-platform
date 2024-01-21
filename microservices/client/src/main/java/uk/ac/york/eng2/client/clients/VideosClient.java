package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.domain.Video;
import io.micronaut.http.HttpResponse;
import uk.ac.york.eng2.client.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {

    @Get("/")
    public Iterable<Video> listVideos();
    @Get("/{id}")
    public VideoDTO getVideo(Long id);
    @Put("/{id}/like")
    public HttpResponse<Void> likeVideo(Long id, String username);
    @Put("/{id}/dislike")
    public HttpResponse<Void> dislikeVideo(Long id);
    @Post("/")
    public HttpResponse<Void> addVideo(@Body VideoDTO body);
    
}
