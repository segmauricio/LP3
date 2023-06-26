package io.bootify.proyecto_panel_gui.controller;

import io.bootify.proyecto_panel_gui.model.Empresa;
import io.bootify.proyecto_panel_gui.model.Producto;
import io.bootify.proyecto_panel_gui.model.Usuario;
import io.bootify.proyecto_panel_gui.service.EmpresaService;
import io.bootify.proyecto_panel_gui.service.ProductoService;
import io.bootify.proyecto_panel_gui.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class HomeController {
    
    final EmpresaService empresaService;
    final ProductoService productoService;

    public HomeController(EmpresaService empresaService, ProductoService productoService) {
        this.empresaService = empresaService;
        this.productoService = productoService;
    }

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }
    
    @GetMapping("/productos")
    public String productos(Model model, HttpSession session) {
//        Empresa empresa = empresaService.get(10000L);
//        session.setAttribute("empresa", empresa);
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        Producto producto = new Producto();
        model.addAttribute("producto", producto);

        return "productos";
    }
    
    @PostMapping("/productos-submit")
    public String productosSubmit(@ModelAttribute Producto producto) {

        // Save to DB after updating
//        producto.setEmpresa(new Empresa());
        productoService.create(producto);
//        Set<Producto> empresaProductos = empresa.getProductos();
//        empresaProductos.add(producto);
//        empresa.setProductos(empresaProductos);
//        empresaService.update(empresa.getId(), empresa);
        return "redirect:/productos";
    }
    
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}