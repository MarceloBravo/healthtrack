package com.example.healthtrack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
    @Bean
    public IUsuario usuario() {
        return new Usuario("Demo", 70.0);
    }
}
