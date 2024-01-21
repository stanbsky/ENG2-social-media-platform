package uk.ac.york.eng2.client.commands;

import io.micronaut.json.JsonMapper;
import uk.ac.york.eng2.client.dto.UserDTO;
import java.io.IOException;
import jakarta.inject.Inject;
import picocli.CommandLine;
import uk.ac.york.eng2.client.clients.UsersClient;

@CommandLine.Command(name = "add-user", description = "Add a user")
public class AddUserCommand implements Runnable {

    @Inject
    private UsersClient client;
    @Inject
    JsonMapper jsonMapper;
    
    @CommandLine.Parameters(index = "0")
    private String body;

    @Override
    public void run() {
        try {
        	System.out.println(client.addUser(
        		jsonMapper.readValue(body, UserDTO.class)).header("Location"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }	}
}
