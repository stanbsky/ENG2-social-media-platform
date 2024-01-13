package uk.ac.york.eng2.sm.repositories;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.sm.domain.Hashtag;

import java.util.Optional;
import java.util.Set;

@Repository
public interface HashtagRepository extends CrudRepository<Hashtag, Long> {

    Set<Hashtag> findByNameIn(Set<String> names);

    @Join(value = "videos", type = Join.Type.LEFT_FETCH)
    Optional<Hashtag> retrieveById(Long id);
}
