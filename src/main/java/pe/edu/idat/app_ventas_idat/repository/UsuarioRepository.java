package pe.edu.idat.app_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.app_ventas_idat.model.bd.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
