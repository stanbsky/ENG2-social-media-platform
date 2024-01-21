package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hashtags")
public class HashtagsController {

	private static final Logger logger = LoggerFactory.getLogger(HashtagsController.class);
	/* protected region private-fields on begin */
	/* protected region private-fields end */
	
	

    @Get("/{id}")
    public Hashtag getHashtag(Long id) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }

}
