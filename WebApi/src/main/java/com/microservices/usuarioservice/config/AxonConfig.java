package com.microservices.usuarioservice.config;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.commandhandling.gateway.DefaultCommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.DefaultQueryGateway;
import org.axonframework.config.DefaultConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Bean
    public org.axonframework.config.Configuration axonConfiguration() {
        return DefaultConfigurer.defaultConfiguration().buildConfiguration();
    }

    @Bean
    public CommandGateway commandGateway(org.axonframework.config.Configuration configuration) {
        return DefaultCommandGateway.builder()
                .commandBus(configuration.commandBus())
                .build();
    }

    @Bean
    public QueryGateway queryGateway(org.axonframework.config.Configuration configuration) {
        return DefaultQueryGateway.builder()
                .queryBus(configuration.queryBus())
                .build();
    }
}
