package uk.ac.york.eng2.sm.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.sm.domain.Hashtag;
import uk.ac.york.eng2.sm.domain.Video;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Serdeable
public class VideoDTO {

    private String title;
    // We only care about returning the name of the hashtag, so use lighter String instead of a full DTO
    private Set<String> hashtags = new HashSet<>();
    private Long views;
    private Long likes;
    private Long dislikes;
    private Long userId;

    public VideoDTO() {
    }

    public VideoDTO(Video video) {
        this.title = video.getTitle();
        Set<String> hashtags = video.getHashtags().stream()
                .map(Hashtag::getName).collect(Collectors.toSet());
        this.hashtags = hashtags;
        this.views = video.getViews();
        this.likes = video.getLikes();
        this.dislikes = video.getDislikes();
        this.userId = video.getUserId();
    }

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getDislikes() {
        return dislikes;
    }

    public void setDislikes(Long dislikes) {
        this.dislikes = dislikes;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "VideoDTO{" +
                "title='" + title + '\'' +
                ", hashtags=" + hashtags +
                ", views=" + views +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", userId=" + userId +
                '}';
    }
}
