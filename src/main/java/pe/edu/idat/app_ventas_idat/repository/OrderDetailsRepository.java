package pe.edu.idat.app_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.app_ventas_idat.model.bd.OrderDetails;
import pe.edu.idat.app_ventas_idat.model.bd.ProductOrderId;

@Repository

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, ProductOrderId> {
}
