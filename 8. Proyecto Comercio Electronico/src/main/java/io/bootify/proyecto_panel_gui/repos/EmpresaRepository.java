package io.bootify.proyecto_panel_gui.repos;

import io.bootify.proyecto_panel_gui.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
