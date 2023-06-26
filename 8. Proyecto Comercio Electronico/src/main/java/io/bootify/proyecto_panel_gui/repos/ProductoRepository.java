package io.bootify.proyecto_panel_gui.repos;

import io.bootify.proyecto_panel_gui.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
