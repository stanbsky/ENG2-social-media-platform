package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.TrendingClient;

@CommandLine.Command(name = "get-trending", description = "Return top 10 trending hashtags")
public class GetTrendingCommand implements Runnable {

    @Inject
    private TrendingClient client;

    @Override
    public void run() {
        System.out.println(client.getTrending());
	}
}
