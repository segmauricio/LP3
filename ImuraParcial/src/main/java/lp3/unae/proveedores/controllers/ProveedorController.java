/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.unae.proveedores.controllers;

/**
 *
 * @author Yuri
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import lp3.unae.proveedores.models.Proveedor;
import lp3.unae.proveedores.repositories.ProveedorRepository;

@Controller
public class ProveedorController {
    @Autowired
    private ProveedorRepository provee_repo;
  
    @GetMapping("/datos")
    public String procesarFormulario(Model modelo)
        {
            var proveedores=provee_repo.findAll();
            modelo.addAttribute("proveedores", proveedores);
            return "datosProveedor";
        }
    @GetMapping("/")
    public String mostrarFormulario(Proveedor proveedores)
    {  
    return "formularioProveedor";
    }
    
    @GetMapping("/editar/{id}")
    public String editar(Proveedor proveedor,Model modelo)
    {
    proveedor=provee_repo.findById(proveedor.getId()).orElse(null);
    modelo.addAttribute("proveedor", proveedor);
    return "formularioProveedor";
    }
    
  @PostMapping("/guardar")
    public String guardar(Proveedor proveedor)
    {  
    provee_repo.save(proveedor);
    return "redirect:/datos";
    }  
    @GetMapping("/borrar/{id}")
    public String borrar(Proveedor proveedor)
    {  
    provee_repo.delete(proveedor);
    return "redirect:/datos";
    }
}
