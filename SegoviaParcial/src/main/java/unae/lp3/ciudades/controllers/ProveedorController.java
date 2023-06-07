package unae.lp3.ciudades.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import unae.lp3.ciudades.models.Proveedor;
import unae.lp3.ciudades.repositories.ProveedorRepository;

public class ProveedorController {
    @Autowired
    private ProveedorRepository proveedor_repo;
  
    @GetMapping("/")
    public String mostrarFormulario(Proveedor proveedor){
        return "formularioProveedor";
    }
    
    @PostMapping("/guardar")
    public String procesarFormulario(Proveedor proveedor){  
        proveedor_repo.save(proveedor);
        return "datosProveedor";
    }
}
