package pe.edu.idat.app_ventas_idat.service;

import pe.edu.idat.app_ventas_idat.model.bd.Rol;

import java.util.List;

public interface IRolService {

    List<Rol> listarRoles();
    Rol guardarRoles(Rol rol);
}
