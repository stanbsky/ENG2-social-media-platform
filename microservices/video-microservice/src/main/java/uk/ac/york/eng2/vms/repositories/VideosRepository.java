package uk.ac.york.eng2.vms.repositories;

import java.util.Optional;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.vms.domain.Video;
import uk.ac.york.eng2.vms.dto.VideoDTO;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {

    @Override
    @NonNull Optional<Video> findById(@NonNull Long aLong);
}
