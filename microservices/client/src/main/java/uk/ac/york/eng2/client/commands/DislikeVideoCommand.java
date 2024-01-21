package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.VideosClient;

@CommandLine.Command(name = "dislike-video", description = "Dislike a video")
public class DislikeVideoCommand implements Runnable {

    @Inject
    private VideosClient client;
    @CommandLine.Parameters(index = "0")
    private Long videoId;
    @CommandLine.Parameters(index = "1")
    private Long userId;

    @Override
    public void run() {
        System.out.println(client.dislikeVideo(videoId, userId));
	}
}
