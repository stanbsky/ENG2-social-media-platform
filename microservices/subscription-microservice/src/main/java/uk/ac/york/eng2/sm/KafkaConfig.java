package uk.ac.york.eng2.sm;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("subscription-microservice.kafka")
public class KafkaConfig {

    @ConfigurationProperties("topics")
    public static class Topics {

        private String newSubscriptions;
        private String newVideos;
        private String newVideosByUserHashtag;
        private String subscriptionVideosByUserHashtag;
        private String nextSubscriptionVideos;
        private String WatchedVideos;

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

        public String getSubscriptionVideosByUserHashtag() {
            return subscriptionVideosByUserHashtag;
        }

        public void setSubscriptionVideosByUserHashtag(String subscriptionVideosByUserHashtag) {
            this.subscriptionVideosByUserHashtag = subscriptionVideosByUserHashtag;
        }

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
    }

    @ConfigurationProperties("config")
    public static class Config {

        private String cleanup;

        public Boolean doCleanup() {
            return Boolean.parseBoolean(cleanup);
        }
    }
}
