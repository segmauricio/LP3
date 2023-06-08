package unae.lp3.newapp.newapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lp3.newapp.newapp.models.Ciudad;
import unae.lp3.newapp.newapp.repositories.CiudadRepository;

/**
 *
 * @author Mauricio
 */
@Controller
@RequestMapping(value="/ciudades")
public class ciudadesController {
    @Autowired
    private CiudadRepository ciudad_repo;
    
    @GetMapping("/")
    public String index(Model modelo){
        var ciudades=ciudad_repo.findAll();
        modelo.addAttribute("ciudades", ciudades);
        modelo.addAttribute("vista", "ciudades/lista");
        modelo.addAttribute("fragmento", "ciudadeslista");
        return "index";
    }
    
    @GetMapping("/nuevo")
    public String nuevo(Model modelo, Ciudad ciudad){
        modelo.addAttribute("vista", "ciudades/form");
        modelo.addAttribute("fragmento", "ciudadesform");
        modelo.addAttribute("ciudad", "ciudad");
        return "index";
    }

    @GetMapping("/editar")
    public String editar(Model modelo, Ciudad ciudad){
        return "index";
    }
    
    @GetMapping("/borrar")
    public String borrar(Model modelo, Ciudad ciudad){
        return "index";
    }
}
