package zoo.hack.repository;

import zoo.hack.dao.FlagEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetRepository extends CrudRepository<FlagEntity,Long> {
}