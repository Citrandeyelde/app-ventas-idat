package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orderdetails")
public class OrderDetails {
    @EmbeddedId
    private ProductOrderId id;
    private Double unitprice;
    private Integer quantity;
    private Double discount;

}
