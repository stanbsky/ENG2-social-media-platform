package uk.ac.york.eng2.vms.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {

    private String title;

    private Long likes;

    private Long userId;

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
                ", likes=" + likes +
                ", userId=" + userId +
                '}';
    }
}
