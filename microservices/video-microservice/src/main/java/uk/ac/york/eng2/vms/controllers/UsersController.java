package uk.ac.york.eng2.vms.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.vms.domain.User;
import uk.ac.york.eng2.vms.dto.UserDTO;
import uk.ac.york.eng2.vms.repositories.UsersRepository;

import java.net.URI;

@Controller("/users")
public class UsersController {

    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
    /* protected region private-fields on begin */
    @Inject
    private UsersRepository usersRepository;
    /* protected region private-fields end */


    @Get("/{id}")
    public UserDTO getUser(Long id) {
        /* protected region controller-method-body on begin */
        User user = usersRepository.findById(id).orElse(null);
        if (user == null) {
            return null;
        }
        return new UserDTO(user);
        /* protected region controller-method-body end */
    }

    @Post("/")
    public HttpResponse<Void> addUser(@Body UserDTO body) {
        /* protected region controller-method-body on begin */
        User newUser = new User();
        newUser.setName(body.getName());
        usersRepository.save(newUser);
        return HttpResponse.created(URI.create("/users/" + newUser.getId()));
        /* protected region controller-method-body end */
    }

}
