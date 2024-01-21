package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.HashtagsClient;

@CommandLine.Command(name = "get-hashtag", description = "Return details on a hashtag")
public class GetHashtagCommand implements Runnable {

    @Inject
    private HashtagsClient client;

    @CommandLine.Parameters(index = "0")
    private Long id;

    @Override
    public void run() {

        System.out.println(client.getHashtag(id));
    }

}
