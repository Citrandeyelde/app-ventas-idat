package pe.edu.idat.app_ventas_idat.model.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orderdetails")
public class OrderDetail {
    @EmbeddedId
    private ProductOrderId id;
    private Double unitprice;
    private Integer quantity;
    private Double discount;
    @ManyToOne
    @MapsId("productid")
    @JsonBackReference
    @JoinColumn(name="productid")
    private Product product;

    @ManyToOne
    @MapsId("orderid")
    @JsonBackReference
    @JoinColumn(name="orderid")
    private Order order;

}
