package uk.ac.york.eng2.vms.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import uk.ac.york.eng2.vms.dto.VideoDTO;

@Entity @Serdeable
public class Video {

    @Id
    @GeneratedValue(generator = "video-id-generator")
    private Long id;

    @Column(nullable = false)
    private String title;

//    @ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne
//    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column
    private Long likes;

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
                ", likes=" + likes +
                '}';
    }

    public VideoDTO toDTO() {
        VideoDTO dto = new VideoDTO();
        dto.setTitle(this.title);
        dto.setLikes(this.likes);
        dto.setUserId(this.user.getId());
        return dto;
    }
//    @ManyToMany
//    @JsonIgnore
//    private Set
}
