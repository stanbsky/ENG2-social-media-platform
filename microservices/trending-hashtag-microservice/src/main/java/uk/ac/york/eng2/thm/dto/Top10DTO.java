package uk.ac.york.eng2.thm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Multimap;
import io.micronaut.serde.annotation.Serdeable;

import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;

@Serdeable
public class Top10DTO {

    @JsonProperty("top10Hashtags")
    private SortedSet<HashtagDTO> hashtags = new TreeSet<>();

    public Top10DTO(Multimap<Long, Long> hashtagCounts) {
        int rank = 0;
        hashtagCounts.entries();
        for (Entry<Long, Long> hashtag : hashtagCounts.entries()) {
            if (rank++ == 10) {
                break;
            }
            HashtagDTO hashtagDTO = new HashtagDTO();
            hashtagDTO.setRank(rank);
            hashtagDTO.setLikes(hashtag.getKey());
            hashtagDTO.setId(hashtag.getValue());
            hashtags.add(hashtagDTO);
        }
    }

    public SortedSet<HashtagDTO> getHashtags() {
        return hashtags;
    }

    public void setHashtags(SortedSet<HashtagDTO> hashtags) {
        this.hashtags = hashtags;
    }
}
