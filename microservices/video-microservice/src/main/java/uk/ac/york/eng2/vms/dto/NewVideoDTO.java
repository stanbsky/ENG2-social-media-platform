package uk.ac.york.eng2.vms.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Set;

@Serdeable
public class NewVideoDTO {

    private Long videoId;
    private Set<Long> hashtags;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Set<Long> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<Long> hashtags) {
        this.hashtags = hashtags;
    }
}
