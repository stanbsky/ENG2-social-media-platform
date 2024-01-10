package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.vms.domain.Hashtag;
import uk.ac.york.eng2.vms.domain.User;
import uk.ac.york.eng2.vms.domain.Video;
import uk.ac.york.eng2.vms.dto.VideoDTO;
import uk.ac.york.eng2.vms.events.VideosProducer;
import uk.ac.york.eng2.vms.repositories.HashtagRepository;
import uk.ac.york.eng2.vms.repositories.UsersRepository;
import uk.ac.york.eng2.vms.repositories.VideosRepository;

import java.net.URI;
import java.util.Set;
import java.util.stream.Collectors;

@Controller("/videos")
public class VideosController {

    private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

    @Inject
    private VideosRepository videosRepository;

    @Inject
    private UsersRepository userRepository;

    @Inject
    private VideosProducer videosProducer;

    @Inject
    private HashtagRepository hashtagRepository;

    // TODO: add hashtag retrieval after pagination implementation
    @Get("/")
    public Iterable<Video> list() {
        return videosRepository.findAll();
    }

    @Transactional
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

        return new VideoDTO(video);
    }

    @Transactional
    @Put("/{id}/like")
    public HttpResponse<Void> likeVideo(Long id, @QueryValue String username) {
        // Return 403 if user doesn't exist: knowing the right user == being authorized
        User user = userRepository.findByName(username).orElse(null);
        if (user == null) {
            return HttpResponse.status(HttpStatus.FORBIDDEN);
        }

        // Return 404 if video doesn't exist
        Video video = videosRepository.findById(id).orElse(null);
        if (video == null) {
            return HttpResponse.notFound();
        }

//        logger.warn("Video: ", video.toString());
//        logger.warn("Hashtags", video.getHashtags().toString());

        // TODO: commented out for debugging
//        // If user has already liked the video, return 200
//        if (user.getLikedVideos().contains(video)) {
//        	return HttpResponse.ok();
//        }

        // TODO: move to worker
        video.setLikes(video.getLikes() + 1);
        videosRepository.update(video);
        videosProducer.likeVideo(video.getId(), video);

        for (Hashtag hashtag : video.getHashtags()) {
//            logger.warn("Hashtag: ", hashtag.toString());
        	videosProducer.likeHashtag(hashtag.getId(), hashtag.getName());
        }

        Set<Video> userVideos = user.getLikedVideos();
        userVideos.add(video);
        user.setLikedVideos(userVideos);
        userRepository.update(user);

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
        User user = userRepository.findById(video.getUserId()).orElse(null);
        if (user == null) {
            return HttpResponse.notFound();
        }

        Video newVideo = new Video();
        newVideo.setTitle(video.getTitle());
        newVideo.setUser(user);

        // Get the list of desired hashtags
        Set<String> videoHashtags = video.getHashtags();
        // Retrieve the names of existing matching hashtags
        Set<Hashtag> existingHashtags = hashtagRepository.findByNameIn(videoHashtags);
        Set<String> existingHashtagsNames = existingHashtags.stream().map(Hashtag::getName).collect(Collectors.toSet());
        // Create a new hashtag for each hashtag that doesn't exist
        Set<Hashtag> newHashtags = videoHashtags.stream().filter(hashtag -> !existingHashtagsNames.contains(hashtag))
                .map(Hashtag::new).collect(Collectors.toSet());
        // Persist the new hashtags
        hashtagRepository.saveAll(newHashtags);
        // Combine the existing and new hashtags
        existingHashtags.addAll(newHashtags);
        newVideo.setHashtags(existingHashtags);

        videosRepository.save(newVideo);
        videosProducer.postVideo(newVideo.getId(), newVideo);

        Set<Video> userVideos = user.getVideos();
        userVideos.add(newVideo);
        userRepository.update(user);

        return HttpResponse.created(URI.create("/videos/" + newVideo.getId()));
    }
}
