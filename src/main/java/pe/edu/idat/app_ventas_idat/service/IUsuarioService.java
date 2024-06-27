package pe.edu.idat.app_ventas_idat.service;

import pe.edu.idat.app_ventas_idat.model.bd.Category;
import pe.edu.idat.app_ventas_idat.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> listarUsuarios();
    Usuario guardarUsuario(Usuario usuario);
}
