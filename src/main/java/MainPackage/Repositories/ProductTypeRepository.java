package MainPackage.Repositories;

import MainPackage.Entities.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long>{
    public ProductType findByName(String name);
}
