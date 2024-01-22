package uk.ac.york.eng2.vms;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import uk.ac.york.eng2.vms.domain.Video;
import uk.ac.york.eng2.vms.events.VideosProducer;
import uk.ac.york.eng2.vms.repositories.HashtagRepository;
import uk.ac.york.eng2.vms.repositories.UsersRepository;
import uk.ac.york.eng2.vms.repositories.VideosRepository;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@MicronautTest
class VideoMicroserviceTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    VideosRepository videosRepository;

    @Inject
    UsersRepository usersRepository;

    @Inject
    HashtagRepository hashtagRepository;

    @Inject
    VideosProducer videosProducer;

    @Inject
    @Client("/videos")
    HttpClient client;

    @MockBean(VideosRepository.class)
    VideosRepository videosRepository() {
        return Mockito.mock(VideosRepository.class);
    }

    @MockBean(UsersRepository.class)
    UsersRepository usersRepository() {
        return Mockito.mock(UsersRepository.class);
    }

    @MockBean(HashtagRepository.class)
    HashtagRepository hashtagRepository() {
        return Mockito.mock(HashtagRepository.class);
    }

    @MockBean(VideosProducer.class)
    VideosProducer videosProducer() {
        return Mockito.mock(VideosProducer.class);
    }

    @Test
    void testListVideos() {
        when(videosRepository.findAll()).thenReturn(Collections.emptyList());
        Iterable<Video> response = client.toBlocking().retrieve(HttpRequest.GET("/"), Iterable.class);
        assertNotNull(response);
        verify(videosRepository).findAll();
    }

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }


}
