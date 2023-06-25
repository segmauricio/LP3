package com.example.ecommerceElectronico.services;

import com.example.ecommerceElectronico.repositories.UserRepository;
import com.example.ecommerceElectronico.security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserDetailsService implements UserDetailsService{
    
    private final UserRepository userRepository;

    public SecurityUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var optUser = this.userRepository.findByUsername(username);
        
        if (optUser.isPresent()){
            return new SecurityUser(optUser.get());
        }
        throw new UsernameNotFoundException("User not found: "+username);
    }
    
    
}
