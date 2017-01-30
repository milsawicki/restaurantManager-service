package MainPackage.Repositories;

import MainPackage.Entities.Position;
import javafx.geometry.Pos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PositionRepository extends CrudRepository<Position, Long>{
    public Position findByOrderNumber(Long orderNumber);
    public Collection<Position> findByWaiter(Long waiterId);
}
