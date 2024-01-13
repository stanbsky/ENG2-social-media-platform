package uk.ac.york.eng2.sm.repositories;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.sm.domain.Video;

import java.util.Optional;

@Repository
// TODO: change to paged repository
public interface VideosRepository extends CrudRepository<Video, Long> {

    @Override
    @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
//    @Query("SELECT v FROM Video v LEFT JOIN FETCH v.hashtags WHERE v.id = :aLong")
    @NonNull Optional<Video> findById(@NonNull Long id);
}
