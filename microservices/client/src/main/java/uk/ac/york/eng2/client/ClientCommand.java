package uk.ac.york.eng2.client;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.client.commands.*;

@Command(name = "client", description = "Deployment microservice client", mixinStandardHelpOptions = true,
        subcommands = {
			GetVideosCommand.class, 
			GetVideoCommand.class, 
			LikeVideoCommand.class, 
			DislikeVideoCommand.class, 
			AddVideoCommand.class, 
			GetUserCommand.class, 
			AddUserCommand.class, 
			GetHashtagCommand.class, 
			GetTrendingCommand.class, 
			GetWatchlistCommand.class, 
			SubscribeCommand.class, 
			UnsubscribeCommand.class        
        })
public class ClientCommand implements Runnable {

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(ClientCommand.class, args);
    }

    public void run() {
    }
}
