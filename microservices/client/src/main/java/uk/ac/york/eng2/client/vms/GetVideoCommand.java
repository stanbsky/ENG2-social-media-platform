package uk.ac.york.eng2.client.vms;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.VideosClient;

@CommandLine.Command(name = "get-video", description = "Return a video")
public class GetVideoCommand implements Runnable {

    @Inject
    private VideosClient client;

    @CommandLine.Parameters(index = "0")
    private Long id;

    @Override
    public void run() {

        System.out.println(client.getVideo(id));
    }

}
