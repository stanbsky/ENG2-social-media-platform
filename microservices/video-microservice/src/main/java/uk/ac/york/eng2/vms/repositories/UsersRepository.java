package uk.ac.york.eng2.vms.repositories;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.vms.domain.User;
import uk.ac.york.eng2.vms.dto.UserDTO;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    @Override
    @NonNull Optional<User> findById(@NonNull Long id);

    Optional<UserDTO> findOne(Long id);
}
