package io.bootify.proyecto_panel_gui.repos;

import io.bootify.proyecto_panel_gui.model.Rol;
import io.bootify.proyecto_panel_gui.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findAllByRoles(Rol rol);

}
