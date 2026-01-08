package com.microservices.usuarioservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Contact;


@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                       .title("UsuarioService")                  
                        .version("1.0.0")                             
                        .description("API para gestionar usuarios de la aplicación")  
                        .contact(new Contact()                         
                                .name("Alejandro Toledo")
                                .email("werner.toledo.diaz@gmail.com")
                ));
    }
}
