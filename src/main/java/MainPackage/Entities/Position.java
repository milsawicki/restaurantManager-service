package MainPackage.Entities;

import MainPackage.Enums.OrderState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Position {

    @Id
    @GeneratedValue
    private Long id;
    private Long orderNumber;
    private Double price;
    @OneToOne
    private Stand stand;
    private OrderState orderState;
    private String remark;
    private boolean isPaid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waiterId", nullable = false)
    private Waiter waiter;

    @OneToMany(mappedBy = "position", targetEntity = Product.class)
    private Collection<Product> products;

    

}
