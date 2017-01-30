package MainPackage.TransferObjects;

import MainPackage.Entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Collection;

@Data
@AllArgsConstructor
public class OrderDetailsTO {
    @NotNull
    private Collection<Product> products;
    @NotNull
    private Long tableNumber;
    @NotNull
    private String remark;
    @NotNull
    private Long waiterId;
    @NotNull
    private boolean isPaid;
}
