package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.SubscriptionsClient;

@CommandLine.Command(name = "get-watchlist", description = "Return latest 10 videos to watch for a given user and hashtag")
public class GetWatchlistCommand implements Runnable {

    @Inject
    private SubscriptionsClient client;

    @CommandLine.Parameters(index = "0")
    private Long userId;
    @CommandLine.Parameters(index = "1")
    private Long hashtagId;

    @Override
    public void run() {

        System.out.println(client.getWatchlist(userId, hashtagId));
    }

}
