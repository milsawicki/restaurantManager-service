package MainPackage.Repositories;

import MainPackage.Entities.Product;
import MainPackage.Entities.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{
    public Collection<Product> findByProductType(ProductType productType);
    public Product findByProductId(Long id);
}
