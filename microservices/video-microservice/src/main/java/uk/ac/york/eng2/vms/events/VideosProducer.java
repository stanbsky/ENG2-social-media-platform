package uk.ac.york.eng2.vms.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.vms.domain.Video;

@KafkaClient
public interface VideosProducer {

    // TODO: refactor messages to reduce body to only relevant bits
    @Topic("eng2-video-posted")
    void postVideo(@KafkaKey Long id, Video v);

    @Topic("eng2-video-liked")
    void likeVideo(@KafkaKey Long id, Video v);

    @Topic("eng2-video-disliked")
    void dislikeVideo(@KafkaKey Long id, Video v);

    @Topic("eng2-video-viewed")
    void viewVideo(@KafkaKey Long id, Video v);

    @Topic("eng2-hashtag-liked")
    void likeHashtag(@KafkaKey Long id, String h);
//    void likeHashtag(@KafkaKey Long id, Object val);

    @Topic("eng2-hashtag-disliked")
    void dislikeHashtag(@KafkaKey Long id, String h);

}
