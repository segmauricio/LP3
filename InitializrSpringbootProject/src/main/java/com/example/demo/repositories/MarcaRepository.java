package com.example.demo.repositories;

import com.example.demo.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
