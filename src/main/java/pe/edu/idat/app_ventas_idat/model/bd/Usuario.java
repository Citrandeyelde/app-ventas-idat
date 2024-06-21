package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.lang.model.element.NestingKind;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nomusuario;
    private String email;
    private String passworrd;
    private String nombres;
    private  String apellidos;
    private Integer activo;

    @ManyToMany(cascade =CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="usuario_rol", joinColumns = @JoinColumn(name = "idusuario"),inverseJoinColumns =@JoinColumn(name="idrol") )
    private Set<Rol> rol;
}
