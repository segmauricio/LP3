package io.bootify.proyecto_panel_gui.repos;

import io.bootify.proyecto_panel_gui.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
