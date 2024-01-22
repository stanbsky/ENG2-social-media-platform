package uk.ac.york.eng2.vms.repositories;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.vms.domain.User;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    @Override
    @Join(value = "videos", type = Join.Type.LEFT_FETCH)
    @Join(value = "likedVideos", type = Join.Type.LEFT_FETCH)
    @NonNull Optional<User> findById(@NonNull Long id);
}
