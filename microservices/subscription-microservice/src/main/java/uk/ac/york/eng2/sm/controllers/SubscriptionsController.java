package uk.ac.york.eng2.sm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.sm.domain.Hashtag;
import uk.ac.york.eng2.sm.domain.User;
import uk.ac.york.eng2.sm.dto.WatchlistDTO;
import uk.ac.york.eng2.sm.events.SubscriptionsProducer;
import uk.ac.york.eng2.sm.kafkaobjects.HashtagSet;
import uk.ac.york.eng2.sm.repositories.HashtagRepository;
import uk.ac.york.eng2.sm.repositories.UsersRepository;

import java.util.Set;

@Controller("/subscriptions")
public class SubscriptionsController {

    @Inject
    private UsersRepository userRepository;

    @Inject
    private HashtagRepository hashtagRepository;

    @Inject
    private SubscriptionsProducer subscriptionsProducer;

    @Transactional
    @Get("/user/{userId}/hashtag/{hashtagId}")
    public WatchlistDTO getWatchlist(Long userId, Long hashtagId) {
        return null;
    }

    @Transactional
    @Put("/user/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> subscribe(Long userId, Long hashtagId) {
        // Return 403 if user doesn't exist: knowing the right user == being authorized
        User user = userRepository.findById(userId).orElse(null);
        if (user == null) {
            return HttpResponse.status(HttpStatus.FORBIDDEN);
        }

        Hashtag hashtag = hashtagRepository.findById(hashtagId).orElse(null);
        if (hashtag == null) {
            return HttpResponse.notFound();
        }

        Set<Hashtag> hashtags = user.getSubscribedHashtags();
        hashtags.add(hashtag);
        user.setSubscribedHashtags(hashtags);
        userRepository.update(user);

        subscriptionsProducer.subscribe(userId, new HashtagSet(hashtags));

        return HttpResponse.ok();
    }

    @Transactional
    @Delete("/user/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> unsubscribe(Long userId, Long hashtagId) {
        return null;
    }
}
