package unae.lp3.ciudades.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import unae.lp3.ciudades.models.Ciudad;
import unae.lp3.ciudades.repositories.CiudadRepository;

@Controller
public class indexController {
    @Autowired
    private CiudadRepository ciudad_repo;
  
    @GetMapping("/")
    public String index(Model modelo)
        {
            //var city=new Ciudad("Ayolas");
            //ciudad_repo.save(city);
            var ciudades=ciudad_repo.findAll();
            modelo.addAttribute("ciudades", ciudades);
            return "index";
        }
    @GetMapping("/nuevo")
    public String nuevo(Ciudad ciudad)
    {  
    return "form";
    }
    @GetMapping("/editar/{id}")
    public String editar(Ciudad ciudad,Model modelo)
    {
    //var eid= ciudad.getId();
    ciudad=ciudad_repo.findById(ciudad.getId()).orElse(null);
    modelo.addAttribute("ciudad", ciudad);
    return "form";
    }
    
  @PostMapping("/guardar")
    public String guardar(Ciudad ciudad)
    {  
    ciudad_repo.save(ciudad);
    return "redirect:/";
    }  
    @GetMapping("/borrar/{id}")
    public String borrar(Ciudad ciudad)
    {  
    ciudad_repo.delete(ciudad);
    return "redirect:/";
    }  
}
