package uk.ac.york.eng2.vms.repositories;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.vms.domain.Hashtag;

import java.util.Set;

@Repository
public interface HashtagRepository extends CrudRepository<Hashtag, Long> {

    Set<Hashtag> findByNameIn(Set<String> names);
}
