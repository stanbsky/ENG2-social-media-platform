package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.sm.domain.Hashtag;

import java.util.HashSet;
import java.util.Set;

@Serdeable
public class HashtagSet {

    private Set<Long> hashtags = new HashSet<>();

    public HashtagSet() {
    }

    public HashtagSet(Set<Hashtag> hashtags) {
        hashtags.forEach(hashtag -> this.hashtags.add(hashtag.getId()));
    }

    public Set<Long> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<Long> hashtags) {
        this.hashtags = hashtags;
    }
}
