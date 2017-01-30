package MainPackage.TransferObjects;

import MainPackage.Enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
public class ProductTO {
    private Long id;
    private Double price;
    private String name;
    private ProductType productType;
}
