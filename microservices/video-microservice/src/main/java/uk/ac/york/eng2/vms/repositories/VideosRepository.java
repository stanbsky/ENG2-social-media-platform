package uk.ac.york.eng2.vms.repositories;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.vms.domain.Video;

import java.util.Optional;

@Repository
// TODO: change to paged repository
public interface VideosRepository extends CrudRepository<Video, Long> {

    @Override
//    @Join(value = "hashtags", type = Join.Type.FETCH)
    @Query("SELECT v FROM Video v LEFT JOIN FETCH v.hashtags WHERE v.id = :aLong")
    @NonNull Optional<Video> findById(@NonNull Long aLong);
}
