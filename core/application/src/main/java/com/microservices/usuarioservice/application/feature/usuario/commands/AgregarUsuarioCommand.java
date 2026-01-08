package com.microservices.usuarioservice.application.feature.usuario.commands;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgregarUsuarioCommand {
    @TargetAggregateIdentifier
    private String usuarioId;
    private String nombre;
    private String email;
}
