package uk.ac.york.eng2.thm.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Set;

@Serdeable
public class Top10DTO {

    private Set<String> hashtags;

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }
}
