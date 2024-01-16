package uk.ac.york.eng2.sm.kafkaobjects;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UsersVideosContainer {

        private UserSet users = new UserSet();
        private VideoSet videos = new VideoSet();

        public UsersVideosContainer() {
        }

        public UsersVideosContainer(UserSet users, VideoSet videos) {
            this.users = users;
            this.videos = videos;
        }

        public void merge(UsersVideosContainer other) {
            this.users.getUsers().addAll(other.getUsers().getUsers());
            this.videos.getVideos().addAll(other.getVideos().getVideos());
        }

        public UserSet getUsers() {
            return users;
        }

        public void setUsers(UserSet users) {
            this.users = users;
        }

        public VideoSet getVideos() {
            return videos;
        }

        public void setVideos(VideoSet videos) {
            this.videos = videos;
        }

        @Override
        public String toString() {
            return "UsersVideosContainer{" +
                    "users=" + users +
                    ", videos=" + videos +
                    '}';
        }

}
