package uk.ac.york.eng2.vms.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UserVideo {

    private Long userId;
    private Long videoId;

    public UserVideo() {
    }

    public UserVideo(Long userId, Long videoId) {
        this.userId = userId;
        this.videoId = videoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "UserHashtag{" +
                "userId=" + userId +
                ", hashtagId=" + videoId +
                '}';
    }
}
