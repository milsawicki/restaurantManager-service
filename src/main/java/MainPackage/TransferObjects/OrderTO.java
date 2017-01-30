package MainPackage.TransferObjects;

import MainPackage.Enums.OrderState;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
public class OrderTO {
    private Double price;
    private Long orderNumber;
    private Long tableNumber;
    private OrderState orderState;
    private String remark;
    private boolean isPaid;
}
