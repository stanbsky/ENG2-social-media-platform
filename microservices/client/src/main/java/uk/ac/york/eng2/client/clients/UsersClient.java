package uk.ac.york.eng2.client.clients;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.client.dto.UserDTO;
import io.micronaut.http.HttpResponse;

@Client("${users.url:`http://localhost:8080/users`}")
public interface UsersClient {

    @Get("/{id}")
    public UserDTO getUser(Long id);
    @Post("/")
    public HttpResponse<Void> addUser(@Body UserDTO body);
    
}
