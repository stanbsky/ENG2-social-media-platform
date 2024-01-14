package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;

import java.util.HashSet;
import java.util.Set;

@Serdeable
public class VideoSet {

    private Set<Long> videos = new HashSet<>();

    public VideoSet() {
    }

    public void removeAll(VideoSet videos) {
        if (videos == null) {
            return;
        }
        this.videos.removeAll(videos.getVideos());
    }

    public Set<Long> getVideos() {
        return videos;
    }

    public void setVideos(Set<Long> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "VideoSet{" +
                "videos=" + videos +
                '}';
    }
}
