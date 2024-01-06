package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.vms.domain.Video;
import uk.ac.york.eng2.vms.dto.VideoDTO;
import uk.ac.york.eng2.vms.repositories.VideosRepository;

import java.net.URI;

@Controller("/videos")
public class VideosController {

    @Inject
    private VideosRepository videosRepository;

    @Get("/")
    public Iterable<Video> list() {
        return videosRepository.findAll();
    }

    @Get("/{id}")
    public VideoDTO getVideo(Long id) {
        return videosRepository.findOne(id).orElse(null);
    }

    @Post("/")
    public HttpResponse<Void> add(@Body VideoDTO video) {
        Video newVideo = new Video();
        newVideo.setTitle(video.getTitle());
        newVideo.setUser(video.getUser());
        newVideo.setLikes(video.getLikes());
        videosRepository.save(newVideo);
        return HttpResponse.created(URI.create("/videos/" + newVideo.getId()));
    }
}
