package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.vms.domain.Hashtag;
import uk.ac.york.eng2.vms.repositories.HashtagRepository;

@Controller("/hashtags")
public class HashtagsController {

    private static final Logger logger = LoggerFactory.getLogger(HashtagsController.class);
    /* protected region private-fields on begin */
    @Inject
    private HashtagRepository hashtagRepository;
    /* protected region private-fields end */


    @Transactional
    @Get("/{id}")
    public Hashtag getHashtag(Long id) {
        /* protected region controller-method-body on begin */
        return hashtagRepository.retrieveById(id).orElse(null);
        /* protected region controller-method-body end */
    }

}
