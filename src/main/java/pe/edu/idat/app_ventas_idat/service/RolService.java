package pe.edu.idat.app_ventas_idat.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.app_ventas_idat.model.bd.Rol;
import pe.edu.idat.app_ventas_idat.repository.RolRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class RolService implements IRolService{
    private RolRepository rolRepository;
    @Override
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol guardarRoles(Rol rol) {
        return rolRepository.save(rol);
    }
}
