package uk.ac.york.eng2.vms.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;

import java.util.Set;

@Entity @Serdeable
@Table(indexes = @Index(columnList = "name", unique = true))
public class Hashtag {

    @Id
    @GeneratedValue(generator = "hashtag-id-generator")
    private Long id;

    @Column(nullable = false)
    private String name;
    @ManyToMany
    @JoinTable(
            name = "video_hashtag",
            joinColumns = @JoinColumn(name = "hashtags_id"),
            inverseJoinColumns = @JoinColumn(name = "video_id")
    )
    // TODO: test orphanRemoval = true
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
                ", videos=" + videos +
                '}';
    }
}
