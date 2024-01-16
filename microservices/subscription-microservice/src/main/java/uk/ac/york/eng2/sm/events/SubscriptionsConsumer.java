package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.sm.KafkaConfig;
import uk.ac.york.eng2.sm.domain.Video;
import uk.ac.york.eng2.sm.kafkaobjects.HashtagSet;
import uk.ac.york.eng2.sm.kafkaobjects.UserHashtag;
import uk.ac.york.eng2.sm.kafkaobjects.UserVideo;
import uk.ac.york.eng2.sm.kafkaobjects.VideoSet;
import uk.ac.york.eng2.sm.repositories.VideosRepository;

import java.util.List;

@KafkaListener("eng2-subscriptions-consumer")
public class SubscriptionsConsumer {

    private final Logger logger = LoggerFactory.getLogger(SubscriptionsConsumer.class);
    private final KafkaConfig.Topics topics;
    @Inject
    private SubscriptionsProducer subscriptionsProducer;
    @Inject
    private VideosRepository videosRepository;

    public SubscriptionsConsumer(KafkaConfig.Topics topics) {
        this.topics = topics;
    }

    @Topic("eng2-subscriptions")
    public void initNewSubscription(@KafkaKey Long userId, HashtagSet hashtags) {
        UserHashtag key = new UserHashtag(userId, 0L);
        for (Long hashtagId : hashtags.getHashtags()) {
            VideoSet vs = new VideoSet();
            List<Video> videos = videosRepository.findByHashtagsId(hashtagId);
            videos.stream().map(Video::getId).forEach(vs::add);
            key.setHashtagId(hashtagId);
            logger.info("Pushing empty message to trigger left join: k:{}, v: {}", key, vs);
            subscriptionsProducer.watchedVideo(key, vs);
            subscriptionsProducer.fakeVideo(key, vs);
        }
    }

    @Topic("eng2-watched-videos")
    public void watchedVideo(@KafkaKey UserVideo userVideo, HashtagSet hashtags) {
        logger.info("Received watched videos: k:{}, v: {}", userVideo, hashtags);
        for (Long hashtagId : hashtags.getHashtags()) {
            UserHashtag key = new UserHashtag(userVideo.getUserId(), hashtagId);
            VideoSet vs = new VideoSet();
            vs.add(userVideo.getVideoId());
            logger.info("Pushing empty message to trigger left join: k:{}, v: {}", key, vs);
            subscriptionsProducer.watchedVideo(key, vs);
            subscriptionsProducer.fakeVideo(key, vs);
        }
    }

}
