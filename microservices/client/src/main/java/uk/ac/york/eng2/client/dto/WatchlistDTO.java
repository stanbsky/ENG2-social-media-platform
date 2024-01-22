package uk.ac.york.eng2.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

@Serdeable
public class WatchlistDTO {
    @JsonProperty("newVideos")
    private Set<Long> newVideos = new TreeSet<>(Collections.reverseOrder());

    public WatchlistDTO() {
    }

    public WatchlistDTO(VideoSet videos) {
        this.newVideos.addAll(videos.getVideos().stream().limit(10).toList());
    }

    @Override
    public String toString() {
        return "WatchlistDTO{" +
                "newVideos=" + newVideos +
                '}';
    }

    public Set<Long> getNewVideos() {
        return newVideos;
    }

    public void setNewVideos(Set<Long> newVideos) {
        this.newVideos = newVideos;
    }
}
