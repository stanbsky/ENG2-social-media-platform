package uk.ac.york.eng2.sm.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.sm.domain.Hashtag;

@Serdeable
public class HashtagDTO {

    private Long hashtagId;

    public HashtagDTO(Long hashtagId) {
        this.hashtagId = hashtagId;
    }

    public HashtagDTO() {
    }

    public HashtagDTO(Hashtag hashtag) {
        this.hashtagId = hashtag.getId();
    }

    public Long getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Long hashtagId) {
        this.hashtagId = hashtagId;
    }

}
