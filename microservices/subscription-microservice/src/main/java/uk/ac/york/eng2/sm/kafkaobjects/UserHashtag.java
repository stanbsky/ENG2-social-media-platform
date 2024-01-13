package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UserHashtag {

    private Long userId;
    private Long hashtagId;

    public UserHashtag() {
    }

    public UserHashtag(Long userId, Long hashtagId) {
        this.userId = userId;
        this.hashtagId = hashtagId;
    }

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

    @Override
    public String toString() {
        return "UserHashtag{" +
                "userId=" + userId +
                ", hashtagId=" + hashtagId +
                '}';
    }
}
