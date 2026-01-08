package com.microservices.usuarioservice.controllers;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;

public abstract class BaseController {

    protected final CommandGateway commandGateway;
    protected final QueryGateway queryGateway;

    protected BaseController(CommandGateway commandGateway, QueryGateway queryGateway) {
        this.commandGateway = commandGateway;
        this.queryGateway = queryGateway;
    }

    // Método utilitario para construir respuestas
    protected String buildResponse(String message) {
        return "[Respuesta] " + message;
    }

    protected <R> R sendCommand(Object command) {
        return commandGateway.sendAndWait(command);
    }

    protected <R> R sendQuery(Object query, Class<R> responseType) {
        return queryGateway.query(query, responseType).join();
    }
}