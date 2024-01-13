package uk.ac.york.eng2.sm.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class SubscriptionDTO {

    private Long hashtagId;
    private Long videoId;

    public SubscriptionDTO(Long hashtagId, Long videoId) {
        this.hashtagId = hashtagId;
        this.videoId = videoId;
    }

    public SubscriptionDTO() {
    }

    public Long getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Long hashtagId) {
        this.hashtagId = hashtagId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}
