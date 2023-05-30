package lp3.unae.Personas.controller;

import java.util.ArrayList;
import java.util.Optional;
import lp3.unae.Personas.model.Persona;
import lp3.unae.Personas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/inicio")
public class InicioController {
    @Autowired
    private PersonaRepository persona_repo;
    @GetMapping("/")
    public String inicio(Model modelo) {
        Long eid= new Long(2);
        
        var personas=  persona_repo.findAll();
        Optional <Persona> opersona = persona_repo.findById(eid);
        //opersona.is
        Persona persona=opersona.get();
          
        modelo.addAttribute("titulo", "Portada");
        modelo.addAttribute("mensaje", "Hola Todos!");
      
        modelo.addAttribute("persona", persona);
        
       modelo.addAttribute("personas", personas);
        return "inicio";

    }

    @GetMapping("/saludo")
    public String saludo() {
        return "hola de nuevo";
    }
}
