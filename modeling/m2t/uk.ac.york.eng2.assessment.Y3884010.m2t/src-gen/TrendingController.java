package uk.ac.york.eng2.thm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/trending")
public class TrendingController {

	private static final Logger logger = LoggerFactory.getLogger(TrendingController.class);
	/* protected region private-fields on begin */
	/* protected region private-fields end */
	
	

    @Get("/")
    public Iterable<Video> getTrending() {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }

}
