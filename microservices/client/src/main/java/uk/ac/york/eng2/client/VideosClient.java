package uk.ac.york.eng2.client;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Patch;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.dto.VideoDTO;
import uk.ac.york.eng2.vms.client.videos.Video;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {
    @Get("/")
    public Iterable<Video> list();

    @Get("/{id}")
    public VideoDTO getVideo(Long id);

    @Put("/{id}/like")
    public HttpResponse<Void> likeVideo(Long id, String username);

    @Patch("/{id}/dislike")
    public HttpResponse<Void> dislikeVideo(Long id);

    @Post("/")
    public HttpResponse<Void> add(VideoDTO video);
}
