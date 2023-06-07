package unae.lp3.ciudades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unae.lp3.ciudades.models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor,Long> {
    
}


