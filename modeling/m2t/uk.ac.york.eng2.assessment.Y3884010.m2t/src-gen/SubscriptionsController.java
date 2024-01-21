package uk.ac.york.eng2.sm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/subscriptions")
public class SubscriptionsController {

	private static final Logger logger = LoggerFactory.getLogger(SubscriptionsController.class);
	/* protected region private-fields on begin */
	/* protected region private-fields end */
	
	

    @Get("/{userId}/hashtag/{hashtagId}")
    public VideoDTO getWatchlist(Long userId, Long hashtagId) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }
    @Put("/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> subHashtag(Long userId, Long hashtagId) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }
    @Delete("/{userId}/hashtag/{hashtagId}")
    public HttpResponse<Void> unsubHashtag(Long userId, Long hashtagId) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }

}
