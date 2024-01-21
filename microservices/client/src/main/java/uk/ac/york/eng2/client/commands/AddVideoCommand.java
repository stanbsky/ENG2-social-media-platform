package uk.ac.york.eng2.client.commands;

import io.micronaut.json.JsonMapper;
import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.VideosClient;
import uk.ac.york.eng2.client.dto.VideoDTO;

import java.io.IOException;

@CommandLine.Command(name = "add-video", description = "Add a video")
public class AddVideoCommand implements Runnable {

    @Inject
    JsonMapper jsonMapper;
    @Inject
    private VideosClient client;
    @CommandLine.Parameters(index = "0")
    private String body;

    @Override
    public void run() {
        try {
            System.out.println(client.addVideo(
                    jsonMapper.readValue(body, VideoDTO.class)).header("Location"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
