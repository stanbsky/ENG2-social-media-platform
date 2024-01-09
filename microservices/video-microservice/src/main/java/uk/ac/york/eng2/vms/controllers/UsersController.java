package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.vms.domain.User;
import uk.ac.york.eng2.vms.dto.UserDTO;
import uk.ac.york.eng2.vms.repositories.UsersRepository;

import java.net.URI;

@Controller("/users")
public class UsersController {

    @Inject
    private UsersRepository usersRepository;

    @Get("/")
    public Iterable<User> list() {
        return usersRepository.findAll();
    }

    @Get("/{id}")
    public UserDTO getUser(Long id) {
        User user = usersRepository.findById(id).orElse(null);
        if (user == null) {
            return null;
        }
        return new UserDTO(user);
    }

    @Post("/")
    public HttpResponse<Void> add(@Body UserDTO user) {
        User newUser = new User();
        newUser.setName(user.getName());
        usersRepository.save(newUser);
        return HttpResponse.created(URI.create("/users/" + newUser.getId()));
    }
}
