package uk.ac.york.eng2.client.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.client.domain.User;
import uk.ac.york.eng2.client.domain.Video;

import java.util.Set;

@Serdeable
public class UserDTO {

    private String name;

    private Set<Video> videos;
    private Set<Video> likedVideos;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.name = user.getName();
        this.videos = user.getVideos();
        this.likedVideos = user.getLikedVideos();
    }

    public Set<Video> getLikedVideos() {
        return likedVideos;
    }

    public void setLikedVideos(Set<Video> likedVideos) {
        this.likedVideos = likedVideos;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", videos=" + videos +
                ", likedVideos=" + likedVideos +
                '}';
    }

    public Set<Video> getVideos() {
        return videos;
    }

    public void setVideos(Set<Video> videos) {
        this.videos = videos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
