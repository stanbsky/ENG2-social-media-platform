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
import uk.ac.york.eng2.vms.kafkaobjects.HashtagSet;
import uk.ac.york.eng2.vms.kafkaobjects.UserVideo;
import uk.ac.york.eng2.vms.repositories.HashtagRepository;
import uk.ac.york.eng2.vms.repositories.UsersRepository;
import uk.ac.york.eng2.vms.repositories.VideosRepository;

import java.net.URI;
import java.util.Set;
import java.util.stream.Collectors;

@Controller("/videos")
public class VideosController {

    private static final Logger logger = LoggerFactory.getLogger(VideosController.class);
    /* protected region private-fields on begin */
    @Inject
    private VideosRepository videosRepository;
    @Inject
    private UsersRepository userRepository;
    @Inject
    private VideosProducer videosProducer;
    @Inject
    private HashtagRepository hashtagRepository;
    /* protected region private-fields end */


    @Get("/")
    public Iterable<Video> listVideos() {
        /* protected region controller-method-body on begin */
        return videosRepository.findAll();
        /* protected region controller-method-body end */
    }

    @Transactional
    @Get("/user/{userId}/video/{videoId}")
    public VideoDTO getVideo(Long videoId, Long userId) {
        /* protected region controller-method-body on begin */
        Video video = videosRepository.findById(videoId).orElse(null);
        if (video == null) {
            return null;
        }

        // TODO: move to worker
        video.setViews(video.getViews() + 1);
        videosRepository.update(video);
        if (userId != null) {
            videosProducer.viewVideo(new UserVideo(userId, video.getId()), new HashtagSet(video.getHashtags()));
        }

        return new VideoDTO(video);
        /* protected region controller-method-body end */
    }

    @Transactional
    @Put("/user/{userId}/video/{videoId}/like")
    public HttpResponse<Void> likeVideo(Long videoId, Long userId) {
        /* protected region controller-method-body on begin */
        // Return 403 if user doesn't exist: knowing the right user == being authorized
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return HttpResponse.status(HttpStatus.FORBIDDEN);
        }

        // Return 404 if video doesn't exist
        Video video = videosRepository.findById(videoId).orElse(null);
        if (video == null) {
            return HttpResponse.notFound();
        }

        // TODO: move to worker
        video.setLikes(video.getLikes() + 1);
        videosRepository.update(video);
        videosProducer.likeVideo(video.getId(), video);

        for (Hashtag hashtag : video.getHashtags()) {
            videosProducer.likeHashtag(user.getId(), hashtag.getId());
        }

        Set<Video> userVideos = user.getLikedVideos();
        userVideos.add(video);
        user.setLikedVideos(userVideos);
        userRepository.update(user);

        return HttpResponse.ok();
        /* protected region controller-method-body end */
    }

    @Put("/user/{userId}/video/{videoId}/dislike")
    public HttpResponse<Void> dislikeVideo(Long videoId, Long userId) {
        /* protected region controller-method-body on begin */
        // Return 403 if user doesn't exist: knowing the right user == being authorized
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return HttpResponse.status(HttpStatus.FORBIDDEN);
        }

        Video video = videosRepository.findById(videoId).orElse(null);
        if (video == null) {
            return HttpResponse.notFound();
        }

        // TODO: move to worker
        video.setDislikes(video.getDislikes() + 1);
        videosRepository.update(video);
        videosProducer.dislikeVideo(video.getId(), video);

        return HttpResponse.ok();
        /* protected region controller-method-body end */
    }

    @Transactional
    @Post("/")
    public HttpResponse<Void> addVideo(@Body VideoDTO video) {
        /* protected region controller-method-body on begin */
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
        videosProducer.postVideo(newVideo.getId(), new HashtagSet(existingHashtags));

        Set<Video> userVideos = user.getVideos();
        userVideos.add(newVideo);
        userRepository.update(user);

        return HttpResponse.created(URI.create("/videos/" + newVideo.getId()));
        /* protected region controller-method-body end */
    }

}
