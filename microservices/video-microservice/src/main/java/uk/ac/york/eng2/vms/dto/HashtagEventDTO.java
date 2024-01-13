package uk.ac.york.eng2.vms.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagEventDTO {

    private Long userId;
    private Long hashtagId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Long hashtagId) {
        this.hashtagId = hashtagId;
    }
}
