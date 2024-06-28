package pe.edu.idat.app_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.app_ventas_idat.model.bd.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
