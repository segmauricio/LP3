package unae.lp3.newapp.newapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Mauricio
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String index(Model modelo){
        modelo.addAttribute("vista", "comunes/template");
        modelo.addAttribute("fragmento", "main");
        return "index";
    }
}
