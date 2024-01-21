package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.VideosClient;

@CommandLine.Command(name = "like-video", description = "Like a video")
public class LikeVideoCommand implements Runnable {

    @Inject
    private VideosClient client;
    @CommandLine.Parameters(index = "0")
    private Long id;
    @CommandLine.Parameters(index = "1")
    private String username;

    @Override
    public void run() {
        System.out.println(client.likeVideo(id, username));
	}
}
