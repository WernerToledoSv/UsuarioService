package com.microservices.usuarioservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

@RequestMapping("/api/v1")
public abstract class BaseController {
    // Método que los controladores pueden usar
    protected String buildResponse(String message) {
        return "[Respuesta] " + message;
    }
    
    @Autowired
    protected CommandGateway commandGateway;

    @Autowired
    protected QueryGateway queryGateway;

    // Método genérico para enviar comandos y recibir respuesta
    protected <R> R sendCommand(Object command) {
        return commandGateway.sendAndWait(command);
    }

    // Método genérico para enviar queries y recibir respuesta
    protected <R> R sendQuery(Object query, Class<R> responseType) {
        return queryGateway.query(query, responseType).join();
    }
}
