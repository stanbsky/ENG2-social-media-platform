package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.sm.kafkaobjects.HashtagSet;
import uk.ac.york.eng2.sm.kafkaobjects.UserHashtag;
import uk.ac.york.eng2.sm.kafkaobjects.VideoSet;

@KafkaClient
public interface SubscriptionsProducer {

    @Topic("eng2-subscriptions")
    void updateSubscriptions(@KafkaKey Long userId, HashtagSet hashtags);

    @Topic("eng2-subscriptions-single")
    void subscribe(@KafkaKey Long userId, Long hashtagId);

    @Topic("eng2-watched-videos-by-user-hashtag")
    void fakeWatchedVideo(@KafkaKey UserHashtag userHashtag, VideoSet videos);

    @Topic("eng2-new-videos-by-user-hashtag")
    void populateNewSubscriptionStream(@KafkaKey UserHashtag userHashtag, VideoSet videos);

    @Topic("eng2-new-videos")
    void fakeNewVideo(@KafkaKey Long id, HashtagSet hashtags);

}
