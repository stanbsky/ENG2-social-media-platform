package uk.ac.york.eng2.client.domain;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Set;

@Serdeable
public class Video {

    private Long id;
    private String title;

    private User user;
    private Set<Hashtag> hashtags;
    private Long likes = 0L;
    private Long dislikes = 0L;
    private Long views = 0L;

    public Set<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public Long getDislikes() {
        return dislikes;
    }

    public void setDislikes(Long dislikes) {
        this.dislikes = dislikes;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getUserId() {
        return user.getId();
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", user=" + user +
                ", hashtags=" + hashtags +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views +
                '}';
    }

}
