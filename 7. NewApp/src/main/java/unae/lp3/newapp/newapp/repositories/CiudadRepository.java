package unae.lp3.newapp.newapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unae.lp3.newapp.newapp.models.Ciudad;
 
@Repository
public interface CiudadRepository extends JpaRepository<Ciudad,Long> {
    
}
