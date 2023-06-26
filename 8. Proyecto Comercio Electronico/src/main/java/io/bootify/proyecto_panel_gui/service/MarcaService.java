package io.bootify.proyecto_panel_gui.service;

import io.bootify.proyecto_panel_gui.model.Marca;
import io.bootify.proyecto_panel_gui.repos.MarcaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class MarcaService {

     private final MarcaRepository marcaRepository;

    public MarcaService(final MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    public Marca get(final Long id) {
        return marcaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Long create(final Marca marca) {
        return marcaRepository.save(marca).getId();
    }

    public void update(final Long id, final Marca marca) {
        final Marca existingMarca = marcaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        
        marcaRepository.save(marca);
    }

    public void delete(final Long id) {
        marcaRepository.deleteById(id);
    }

}