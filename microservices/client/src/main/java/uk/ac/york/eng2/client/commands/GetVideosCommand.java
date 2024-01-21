package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.VideosClient;

@CommandLine.Command(name = "get-videos", description = "Return all videos")
public class GetVideosCommand implements Runnable {

    @Inject
    private VideosClient client;


    @Override
    public void run() {

        System.out.println(client.listVideos());
    }

}
