package uk.ac.york.eng2.vms.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.vms.dto.UserDTO;

import java.util.Set;

@Entity @Serdeable
public class User {

    @Id
    @GeneratedValue(generator = "user-id-generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                ", videos=" + videos +
                '}';
    }

    public UserDTO toDTO() {
        UserDTO dto = new UserDTO();
        dto.setName(this.name);
        dto.setEmail(this.email);
        dto.setVideos(this.videos);
        return dto;
    }

}
