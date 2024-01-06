package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.vms.domain.User;
import uk.ac.york.eng2.vms.domain.Video;
import uk.ac.york.eng2.vms.dto.UserDTO;
import uk.ac.york.eng2.vms.dto.VideoDTO;
import uk.ac.york.eng2.vms.repositories.VideosRepository;
import uk.ac.york.eng2.vms.repositories.UsersRepository;


import java.net.URI;
import java.util.Set;

@Controller("/videos")
public class VideosController {

    private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

    @Inject
    private VideosRepository videosRepository;

    @Inject
    private UsersRepository userRepository;

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
        return video.toDTO();
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
        newVideo.setLikes(video.getLikes());
        newVideo.setUser(user);
        videosRepository.save(newVideo);

        Set<Video> userVideos = user.getVideos();
        userVideos.add(newVideo);
        userRepository.update(user);

        return HttpResponse.created(URI.create("/videos/" + newVideo.getId()));
    }
}
