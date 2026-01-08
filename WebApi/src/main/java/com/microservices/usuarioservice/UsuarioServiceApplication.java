package com.microservices.usuarioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication

@SpringBootApplication(scanBasePackages = {
    "com.example.application",// Casos de uso y comandos
    "com.example.domain"      // Entidades y puertos
})

public class UsuarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioServiceApplication.class, args);
	}

}
