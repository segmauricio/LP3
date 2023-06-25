package com.example.ecommerceElectronico.repositories;

import com.example.ecommerceElectronico.model.Authority;
import com.example.ecommerceElectronico.utils.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Optional<Authority> findByName(AuthorityName name);
    
}
