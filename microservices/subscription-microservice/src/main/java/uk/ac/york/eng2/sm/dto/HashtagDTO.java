package uk.ac.york.eng2.sm.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagDTO {

    private Long hashtagId;
    private String hashtagName;

    public HashtagDTO(Long hashtagId) {
        this.hashtagId = hashtagId;
    }

    public HashtagDTO() {
    }

    public Long getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Long hashtagId) {
        this.hashtagId = hashtagId;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public void setHashtagName(String hashtagName) {
        this.hashtagName = hashtagName;
    }
}
