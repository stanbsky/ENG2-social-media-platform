package uk.ac.york.eng2.sm;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("subscription-microservice.kafka")
public class KafkaConfig {

    @ConfigurationProperties("topics")
    public static class Topics {

        private String newSubscriptions;
        private String newSubscriptionsSingle;
        private String newVideos;
        private String newVideosByUserHashtag;
        private String nextSubscriptionVideos;
        private String WatchedVideos;
        private String WatchedVideosByUserHashtag;
        private String newSubSuggestions;

        public String getNewSubscriptionsSingle() {
            return newSubscriptionsSingle;
        }

        public void setNewSubscriptionsSingle(String newSubscriptionsSingle) {
            this.newSubscriptionsSingle = newSubscriptionsSingle;
        }

        public String getWatchedVideosByUserHashtag() {
            return WatchedVideosByUserHashtag;
        }

        public void setWatchedVideosByUserHashtag(String watchedVideosByUserHashtag) {
            WatchedVideosByUserHashtag = watchedVideosByUserHashtag;
        }

        public String getNewSubSuggestions() {
            return newSubSuggestions;
        }

        public void setNewSubSuggestions(String newSubSuggestions) {
            this.newSubSuggestions = newSubSuggestions;
        }

        public String getNewSubscriptions() {
            return newSubscriptions;
        }

        public void setNewSubscriptions(String newSubscriptions) {
            this.newSubscriptions = newSubscriptions;
        }

        public String getNewVideos() {
            return newVideos;
        }

        public void setNewVideos(String newVideos) {
            this.newVideos = newVideos;
        }

        public String getNewVideosByUserHashtag() {
            return newVideosByUserHashtag;
        }

        public void setNewVideosByUserHashtag(String newVideosByUserHashtag) {
            this.newVideosByUserHashtag = newVideosByUserHashtag;
        }

        /*public String getSubscriptionVideosByUserHashtag() {
            return subscriptionVideosByUserHashtag;
        }

        public void setSubscriptionVideosByUserHashtag(String subscriptionVideosByUserHashtag) {
            this.subscriptionVideosByUserHashtag = subscriptionVideosByUserHashtag;
        }*/

        public String getNextSubscriptionVideos() {
            return nextSubscriptionVideos;
        }

        public void setNextSubscriptionVideos(String nextSubscriptionVideos) {
            this.nextSubscriptionVideos = nextSubscriptionVideos;
        }

        public String getWatchedVideos() {
            return WatchedVideos;
        }

        public void setWatchedVideos(String watchedVideos) {
            WatchedVideos = watchedVideos;
        }

        @Override
        public String toString() {
            return "Topics{" +
                    "newSubscriptions='" + newSubscriptions + '\'' +
                    ", newVideos='" + newVideos + '\'' +
//                    ", newVideosByUserHashtag='" + newVideosByUserHashtag + '\'' +
//                    ", subscriptionVideosByUserHashtag='" + subscriptionVideosByUserHashtag + '\'' +
                    ", nextSubscriptionVideos='" + nextSubscriptionVideos + '\'' +
                    ", WatchedVideos='" + WatchedVideos + '\'' +
                    '}';
        }
    }

    @ConfigurationProperties("stores")
    public static class Stores {
        private String nextSubscriptionVideos;

        public String getNextSubscriptionVideos() {
            return nextSubscriptionVideos;
        }

        public void setNextSubscriptionVideos(String nextSubscriptionVideos) {
            this.nextSubscriptionVideos = nextSubscriptionVideos;
        }
    }

    @ConfigurationProperties("misc")
    public static class Config {

        private Boolean cleanup;

        @Override
        public String toString() {
            return "Config{" +
                    "cleanup=" + cleanup +
                    '}';
        }

        public Boolean getCleanup() {
            return cleanup;
        }

        public void setCleanup(Boolean cleanup) {
            this.cleanup = cleanup;
        }

        public Boolean doCleanup() {
            return cleanup;
        }
    }
}
