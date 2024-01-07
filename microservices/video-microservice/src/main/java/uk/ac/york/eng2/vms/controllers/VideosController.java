package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.vms.domain.User;
import uk.ac.york.eng2.vms.domain.Video;
import uk.ac.york.eng2.vms.dto.VideoDTO;
import uk.ac.york.eng2.vms.events.VideosProducer;
import uk.ac.york.eng2.vms.repositories.UsersRepository;
import uk.ac.york.eng2.vms.repositories.VideosRepository;

import java.net.URI;
import java.util.Set;

@Controller("/videos")
public class VideosController {

    private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

    @Inject
    private VideosRepository videosRepository;

    @Inject
    private UsersRepository userRepository;

    @Inject
    private VideosProducer videosProducer;

    @Get("/")
    public Iterable<Video> list() {
        return videosRepository.findAll();
    }

    @Get("/{id}")
    public VideoDTO getVideo(Long id) {
        Video video = videosRepository.findById(id).orElse(null);
        if (video == null) {
            return null;
        }

        // TODO: move to worker
        video.setViews(video.getViews() + 1);
        videosRepository.update(video);
        videosProducer.viewVideo(video.getId(), video);

        return video.toDTO();
    }

    @Patch("/{id}/like")
    public HttpResponse<Void> likeVideo(Long id) {
        Video video = videosRepository.findById(id).orElse(null);
        if (video == null) {
            return HttpResponse.notFound();
        }

        // TODO: move to worker
        video.setLikes(video.getLikes() + 1);
        videosRepository.update(video);
        videosProducer.likeVideo(video.getId(), video);

        return HttpResponse.ok();
    }

    @Patch("/{id}/dislike")
    public HttpResponse<Void> dislikeVideo(Long id) {
        Video video = videosRepository.findById(id).orElse(null);
        if (video == null) {
            return HttpResponse.notFound();
        }

        // TODO: move to worker
        video.setDislikes(video.getDislikes() + 1);
        videosRepository.update(video);
        videosProducer.dislikeVideo(video.getId(), video);

        return HttpResponse.ok();
    }

    @Post("/")
    @Transactional
    public HttpResponse<Void> add(@Body VideoDTO video) {
        logger.warn("VideoDTO: " + video);
        User user = userRepository.findById(video.getUserId()).orElse(null);
        if (user == null) {
            return HttpResponse.notFound();
        }
        logger.warn("User: " + user);

        Video newVideo = new Video();
        newVideo.setTitle(video.getTitle());
        newVideo.setViews(0L);
        newVideo.setLikes(0L);
        newVideo.setDislikes(0L);
        newVideo.setUser(user);
        videosRepository.save(newVideo);

        videosProducer.postVideo(newVideo.getId(), newVideo);

        Set<Video> userVideos = user.getVideos();
        userVideos.add(newVideo);
        userRepository.update(user);

        return HttpResponse.created(URI.create("/videos/" + newVideo.getId()));
    }
}
