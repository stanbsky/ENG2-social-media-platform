package uk.ac.york.eng2.sm.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.sm.domain.Video;
import uk.ac.york.eng2.sm.kafkaobjects.HashtagSet;
import uk.ac.york.eng2.sm.kafkaobjects.UserHashtag;
import uk.ac.york.eng2.sm.kafkaobjects.VideoSet;
import uk.ac.york.eng2.sm.repositories.VideosRepository;

import java.util.List;

@KafkaListener("eng2-subscriptions-consumer")
public class SubscriptionsConsumer {

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionsConsumer.class);

    @Inject
    private SubscriptionsProducer subscriptionsProducer;
    @Inject
    private VideosRepository videosRepository;

    @Topic("eng2-subscriptions-single")
    public void initNewSubscription(@KafkaKey Long userId, Long hashtagId) {
        // This is a hack to prod into action the subscriptions stream on new subscription:
        // - populate the new subscription stream with videos
        // - prod the stream into action by sending a null video set to watched videos
        // - emit the videos to the new subscription stream - if we don't do this, the
        //   pre-populated videos will be lost on first new video posted
        // TODO: find a way to emit the query so that we only grab 10 latest videos that the user hasn't seen
        UserHashtag key = new UserHashtag(userId, hashtagId);
        VideoSet vs = new VideoSet();
        List<Video> videos = videosRepository.findByHashtagsId(hashtagId);
        logger.info("Populating new subscription stream with: {}", videos);
        videos.stream().map(Video::getId).forEach(vs::add);
        subscriptionsProducer.populateNewSubscriptionStream(key, vs);
        HashtagSet hs = new HashtagSet();
        hs.add(hashtagId);
        videos.stream().map(Video::getId).forEach(id -> subscriptionsProducer.fakeNewVideo(id, hs));
        subscriptionsProducer.fakeWatchedVideo(key, new VideoSet());
    }
}
