package uk.ac.york.eng2.client.domain;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.client.dto.VideoDTO;

import java.util.Set;
import java.util.stream.Collectors;

@Serdeable
public class Hashtag {

    private Long id;
    private String name;
    private Set<Video> videos;

    public Hashtag() {
    }

    public Hashtag(String name) {
        this.name = name;
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
        return "Hashtag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", videos=" + videos.stream().map(VideoDTO::new).collect(Collectors.toSet()) +
                '}';
    }
}
