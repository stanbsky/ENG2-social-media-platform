package uk.ac.york.eng2.vms.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.vms.domain.Video;

import java.util.Set;

@Serdeable
public class UserDTO {

    private String name;
    private String email;

    private Set<Video> videos;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
