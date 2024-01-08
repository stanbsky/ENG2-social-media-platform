package uk.ac.york.eng2.vms.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.vms.dto.VideoDTO;

import java.util.HashSet;
import java.util.Set;

@Entity
@Serdeable
public class Video {

    private static final Logger logger = LoggerFactory.getLogger(Video.class);

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
    @JsonIgnore
//    @ManyToMany(mappedBy = "videos")
    // NOTE: I've just moved the mappedBy from the definition above the setter method.
    // Look out for the way the relation tables are working: hashtags and video exist,
    // but they're not mapped atm in hashtag_video table. And now we're getting a 404 instead of
    // previous lazy init related exception.
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Hashtag> hashtags;
    @Column
    private Long likes = 0L;
    @Column
    private Long dislikes = 0L;
    @Column
    private Long views = 0L;

//    @JsonIgnore
//    @ManyToMany(mappedBy = "videos-hashtags", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @ManyToMany(mappedBy = "videos-hashtags")
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
                ", title='" + title +
                ", hashtags=" + hashtags +
                ", userId=" + this.getUserId() +
                ", likes=" + likes +
                '}';
    }

    // TODO: move to DTO constructor
    public VideoDTO toDTO() {
        logger.warn("Video: " + this);
        logger.warn("Hashtags: " + this.getHashtags());
        VideoDTO dto = new VideoDTO();
        dto.setTitle(this.title);
        dto.setViews(this.views);
        dto.setLikes(this.likes);
        dto.setDislikes(this.dislikes);
        dto.setUserId(this.user.getId());

        Set<String> hashtags = new HashSet<>();
        for (Hashtag hashtag : this.getHashtags()) {
            hashtags.add(hashtag.getName());
        }
        dto.setHashtags(hashtags);

        return dto;
    }
}
