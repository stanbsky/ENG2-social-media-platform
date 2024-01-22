package uk.ac.york.eng2.thm.controllers;

import com.google.common.collect.Multimap;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.thm.dto.Top10DTO;
import uk.ac.york.eng2.thm.events.HashtagIQS;

@Controller("/trending")
public class TrendingController {

    private static final Logger logger = LoggerFactory.getLogger(TrendingController.class);
    /* protected region private-fields on begin */
    @Inject
    private HashtagIQS hashtagIQS;
    /* protected region private-fields end */


    @Get("/")
    public Top10DTO getTrending() {
        /* protected region controller-method-body on begin */
        Multimap<Long, Long> counts = hashtagIQS.getHashtagCounts();
        logger.warn("counts: {}", counts);
        return new Top10DTO(counts);
        /* protected region controller-method-body end */
    }

}
