package MainPackage.Repositories;

import MainPackage.Entities.Stand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StandRepository extends CrudRepository<Stand, Long>{
    public Stand findByTableNumber(Long tableNumber);
}
