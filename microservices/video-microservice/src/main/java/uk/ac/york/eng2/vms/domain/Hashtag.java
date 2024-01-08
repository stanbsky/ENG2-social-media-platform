package uk.ac.york.eng2.vms.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import uk.ac.york.eng2.vms.dto.HashtagDTO;

import java.util.Set;

@Entity @Serdeable
public class Hashtag {

    @Id
    @GeneratedValue(generator = "hashtag-id-generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @JsonIgnore
    @ManyToMany
    private Set<Video> videos;

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

    // TODO: remove, or change to a constructor
    public HashtagDTO toDTO() {
    	HashtagDTO dto = new HashtagDTO();
    	dto.setName(name);
    	return dto;
    }
}
