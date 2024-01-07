package uk.ac.york.eng2.vms.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import uk.ac.york.eng2.vms.dto.VideoDTO;

@Entity
@Serdeable
public class Video {

    @Id
    @GeneratedValue(generator = "video-id-generator")
    private Long id;

    @Column(nullable = false)
    private String title;

    //    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ManyToOne
//    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column
    private Long likes;

    @Column
    private Long dislikes;
    @Column
    private Long views;

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
                ", userId=" + this.getUserId() +
                ", likes=" + likes +
                '}';
    }

    public VideoDTO toDTO() {
        VideoDTO dto = new VideoDTO();
        dto.setTitle(this.title);
        dto.setViews(this.views);
        dto.setLikes(this.likes);
        dto.setDislikes(this.dislikes);
        dto.setUserId(this.user.getId());
        return dto;
    }
//    @ManyToMany
//    @JsonIgnore
//    private Set
}
