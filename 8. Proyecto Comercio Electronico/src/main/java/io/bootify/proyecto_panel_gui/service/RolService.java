package io.bootify.proyecto_panel_gui.service;

import io.bootify.proyecto_panel_gui.model.Rol;
import io.bootify.proyecto_panel_gui.repos.RolRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class RolService {

     private final RolRepository rolRepository;

    public RolService(final RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    public Rol get(final Long id) {
        return rolRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Long create(final Rol rol) {
        return rolRepository.save(rol).getId();
    }

    public void update(final Long id, final Rol rol) {
        final Rol existingRol = rolRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        
        rolRepository.save(rol);
    }

    public void delete(final Long id) {
        rolRepository.deleteById(id);
    }

}