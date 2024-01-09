package uk.ac.york.eng2.vms.controllers;

import io.micronaut.data.annotation.Join;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.vms.domain.Hashtag;
import uk.ac.york.eng2.vms.repositories.HashtagRepository;

@Controller("/hashtags")
public class HashtagsController {

    @Inject
    private HashtagRepository hashtagRepository;

    @Transactional
    @Get("/{id}")
    @Join(value = "videos", type = Join.Type.LEFT_FETCH)
    public Hashtag getHashtag(Long id) {
        return hashtagRepository.retrieveById(id).orElse(null);
    }
}
