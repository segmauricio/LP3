package io.bootify.proyecto_panel_gui.service;

import io.bootify.proyecto_panel_gui.model.Producto;
import io.bootify.proyecto_panel_gui.repos.ProductoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class ProductoService {

     private final ProductoRepository productoRepository;

    public ProductoService(final ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto get(final Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Long create(final Producto producto) {
        return productoRepository.save(producto).getId();
    }

    public void update(final Long id, final Producto producto) {
        final Producto existingProducto = productoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        
        productoRepository.save(producto);
    }

    public void delete(final Long id) {
        productoRepository.deleteById(id);
    }

}