package uk.ac.york.eng2.vms.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {

    private String title;
    private Long views;
    private Long likes;
    private Long dislikes;
    private Long userId;

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
                ", views=" + views +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", userId=" + userId +
                '}';
    }
}
