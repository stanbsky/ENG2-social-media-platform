package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;

import java.util.HashSet;
import java.util.Set;

@Serdeable
public class VideoSet {

    private Set<Long> videos = new HashSet<>();
    private Boolean dummy = false;

    public VideoSet() {
    }

    public Boolean getDummy() {
        return dummy;
    }

    public void setDummy(Boolean dummy) {
        this.dummy = dummy;
    }

    public void removeAll(VideoSet videos) {
        if (videos == null) {
            return;
        }
        this.videos.removeAll(videos.getVideos());
    }

    public void add(Long video) {
        this.videos.add(video);
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
