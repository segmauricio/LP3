package com.example.demo.repositories;

import com.example.demo.model.Rol;
import com.example.demo.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findAllByRoles(Rol rol);

}
