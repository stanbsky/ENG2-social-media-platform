package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.SubscriptionsClient;

@CommandLine.Command(name = "subscribe", description = "Subscribe to a hashtag")
public class SubscribeCommand implements Runnable {

    @Inject
    private SubscriptionsClient client;

    @CommandLine.Parameters(index = "0")
    private Long userId;
    @CommandLine.Parameters(index = "1")
    private Long hashtagId;

    @Override
    public void run() {

        System.out.println(client.subHashtag(userId, hashtagId));
    }

}
