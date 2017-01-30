package MainPackage.TransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
public class ProductTO {
    private Long id;
    private Double price;
    private String name;
}
