package uk.ac.york.eng2.client.commands;

import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.UsersClient;

@CommandLine.Command(name = "add-user", description = "Add a user")
public class AddUserCommand implements Runnable {

    @Inject
    private UsersClient client;


    @Override
    public void run() {

        System.out.println(client.addUser());
    }

}
