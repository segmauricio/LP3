package com.example.demo.controller;

import com.example.demo.model.Empresa;
import com.example.demo.model.Producto;
import com.example.demo.model.Usuario;
import com.example.demo.service.EmpresaService;
import com.example.demo.service.ProductoService;
import com.example.demo.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    
    final EmpresaService empresaService;
    final ProductoService productoService;
    final UsuarioService usuarioService;

    public HomeController(EmpresaService empresaService, ProductoService productoService, UsuarioService usuarioService) {
        this.empresaService = empresaService;
        this.productoService = productoService;
        this.usuarioService = usuarioService;
    }
    
    @GetMapping("/index")
    public String index(Model model) {

        return "index";
    }
    
    @GetMapping("/login-true")
    public String index2(Model model) {

        return "login2";
    }
   
    @GetMapping("/new-user")
    public String usuarios(Model model, HttpSession session){
        List<Usuario> usuarios = usuarioService.findAll();
        model.addAttribute("usuarios", usuarios);
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        
        return "newuser";
    }
    
    @PostMapping("/usuarios-submit")
    public String usuariosSubmit(@ModelAttribute Usuario usuario) {

        usuarioService.create(usuario);
        return "redirect:/admin-panel";
        
    }
    @GetMapping("/new-empresa")
    public String empresas(Model model, HttpSession session){
        List<Empresa> empresas = empresaService.findAll();
        model.addAttribute("empresas", empresas);
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        
        return "newempresa";
    }
    
    @PostMapping("/empresas-submit")
    public String empresasubmit(@ModelAttribute Empresa empresa) {

        empresaService.create(empresa);
        return "redirect:/admin-panel";
    }
    
    @GetMapping("admin-panel")
    public String adminpanel(Model model){
        List<Usuario> usuarios = usuarioService.findAll();
        model.addAttribute("usuarios", usuarios);
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        
        List<Empresa> empresas = empresaService.findAll();
        model.addAttribute("empresas", empresas);
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        
        return "adminpanel";
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
        return "index";
    }
}