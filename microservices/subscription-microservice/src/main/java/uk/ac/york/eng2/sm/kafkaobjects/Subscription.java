package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.sm.dto.HashtagDTO;

import java.util.Set;

@Serdeable
public class Subscription {

    private Long userId;
    private Set<HashtagDTO> hashtags;

    public Subscription() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<HashtagDTO> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<HashtagDTO> hashtags) {
        this.hashtags = hashtags;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "userId=" + userId +
                ", hashtags=" + hashtags +
                '}';
    }
}
