package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.UsersClient;

@CommandLine.Command(name = "get-user", description = "Return details on a user")
public class GetUserCommand implements Runnable {

    @Inject
    private UsersClient client;
    @CommandLine.Parameters(index = "0")
    private Long id;

    @Override
    public void run() {
        System.out.println(client.getUser(id));
	}
}
