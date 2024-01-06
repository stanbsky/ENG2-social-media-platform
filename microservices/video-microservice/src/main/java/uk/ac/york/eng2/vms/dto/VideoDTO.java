package uk.ac.york.eng2.vms.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {

    private String title;

    private String user;

    private Long likes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }
}
