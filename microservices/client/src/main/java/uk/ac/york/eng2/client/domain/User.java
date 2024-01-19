package uk.ac.york.eng2.client.domain;

import io.micronaut.serde.annotation.Serdeable;

import java.util.HashSet;
import java.util.Set;

@Serdeable
public class User {

    private Long id;
    private String name;
    private Set<Video> videos;
    private Set<Video> likedVideos = new HashSet<>();

    public Set<Video> getLikedVideos() {
        return likedVideos;
    }

    public void setLikedVideos(Set<Video> likedVideos) {
        this.likedVideos = likedVideos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Video> getVideos() {
        return videos;
    }

    public void setVideos(Set<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", videos=" + videos +
                ", likedVideos=" + likedVideos +
                '}';
    }
}
