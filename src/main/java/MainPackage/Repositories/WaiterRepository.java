package MainPackage.Repositories;

import MainPackage.Entities.Waiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaiterRepository extends CrudRepository<Waiter, Long>{
    public Waiter findById(Long id);
}
