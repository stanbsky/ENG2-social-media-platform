package uk.ac.york.eng2.client.vms;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.client.VideosClient;

@Command(name = "get-videos", description = "Return all videos")
public class GetVideosCommand implements Runnable {

    @Inject
    private VideosClient client;

    @Override
    public void run() {

        client.list().forEach(System.out::println);
    }
}
