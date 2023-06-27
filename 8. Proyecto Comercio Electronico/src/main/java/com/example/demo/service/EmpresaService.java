package com.example.demo.service;

import com.example.demo.model.Empresa;
import com.example.demo.repositories.EmpresaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class EmpresaService {

     private final EmpresaRepository empresaRepository;

    public EmpresaService(final EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Empresa get(final Long id) {
        return empresaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Long create(final Empresa empresa) {
        return empresaRepository.save(empresa).getId();
    }

    public void update(final Long id, final Empresa empresa) {
        final Empresa existingEmpresa = empresaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        
        empresaRepository.save(empresa);
    }

    public void delete(final Long id) {
        empresaRepository.deleteById(id);
    }

}
