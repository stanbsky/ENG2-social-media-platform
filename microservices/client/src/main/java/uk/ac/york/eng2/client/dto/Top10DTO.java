package uk.ac.york.eng2.client.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.SortedSet;

@Serdeable
public class Top10DTO {

    private SortedSet<HashtagDTO> top10Hashtags;

    public Top10DTO() {
    }

    public SortedSet<HashtagDTO> getTop10Hashtags() {
        return top10Hashtags;
    }

    public void setTop10Hashtags(SortedSet<HashtagDTO> top10Hashtags) {
        this.top10Hashtags = top10Hashtags;
    }

    @Override
    public String toString() {
        return "Top10DTO{" +
                "top10Hashtags=" + top10Hashtags +
                '}';
    }
}
