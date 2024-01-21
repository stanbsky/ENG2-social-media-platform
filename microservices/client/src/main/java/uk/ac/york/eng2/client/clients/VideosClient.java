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
    @Get("/user/{userId}/video/{videoId}")
    public VideoDTO getVideo(Long videoId, Long userId);
    @Put("/user/{userId}/video/{videoId}like")
    public HttpResponse<Void> likeVideo(Long videoId, Long userId);
    @Put("/user/{userId}/video/{videoId}/dislike")
    public HttpResponse<Void> dislikeVideo(Long videoId, Long userId);
    @Post("/")
    public HttpResponse<Void> addVideo(@Body VideoDTO body);
    
}
