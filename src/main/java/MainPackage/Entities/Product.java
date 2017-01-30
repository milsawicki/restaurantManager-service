package MainPackage.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {

    @Id
    private Long productId;

    private String name;
    private Double price;

    @OneToOne
    private ProductType productType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "positionProducts", joinColumns = {
            @JoinColumn(name = "productId", referencedColumnName = "productId")}, inverseJoinColumns = {
            @JoinColumn(name = "id", referencedColumnName = "id")})
    @JsonIgnore
    private Position position;
}
