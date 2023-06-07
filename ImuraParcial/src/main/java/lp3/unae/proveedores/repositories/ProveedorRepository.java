/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lp3.unae.proveedores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import lp3.unae.proveedores.models.Proveedor;

/**
 *
 * @author Yuri
 */
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Long>{
    
}
