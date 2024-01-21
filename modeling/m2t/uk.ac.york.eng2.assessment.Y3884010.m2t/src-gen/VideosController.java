package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/videos")
public class VideosController {

	private static final Logger logger = LoggerFactory.getLogger(VideosController.class);
	/* protected region private-fields on begin */
	/* protected region private-fields end */
	
	

    @Get("/")
    public Iterable<Video> listVideos() {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }
    @Get("/{id}")
    public VideoDTO getVideo(Long id) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }
    @Put("/{id}/like")
    public HttpResponse<Void> likeVideo(Long id, String username) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }
    @Put("/{id}/dislike")
    public HttpResponse<Void> dislikeVideo(Long id) {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }
    @Post("/")
    public HttpResponse<Void> addVideo() {
        /* protected region controller-method-body on begin */
	/* protected region controller-method-body end */	
    }

}
