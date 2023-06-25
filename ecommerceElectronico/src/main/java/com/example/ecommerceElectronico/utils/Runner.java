package com.example.ecommerceElectronico.utils;

import com.example.ecommerceElectronico.model.Authority;
import com.example.ecommerceElectronico.model.User;
import com.example.ecommerceElectronico.repositories.AuthorityRepository;
import com.example.ecommerceElectronico.repositories.UserRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    
    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;

    public Runner(UserRepository userRepository, AuthorityRepository authorityRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }
            
    
    @Override
    public void run(String... args) throws Exception{
        if(this.authorityRepository.count() == 0){
            this.authorityRepository.saveAll(List.of(
                    new Authority(AuthorityName.ADMIN),
                    new Authority(AuthorityName.READ),
                    new Authority(AuthorityName.WRITE)
            ));
        }
        
        if(this.userRepository.count() == 0){
            var encoders = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            this.userRepository.saveAll(List.of(
                    new User("uncledave", encoders.encode("UncleDave123"), List.of(this.authorityRepository.findByName(AuthorityName.ADMIN).get())),
                    new User("user01", "User01123", List.of(this.authorityRepository.findByName(AuthorityName.READ).get())),
                    new User("user02", "User02123", List.of(this.authorityRepository.findByName(AuthorityName.WRITE).get()))
            ));
        }
    }
}
