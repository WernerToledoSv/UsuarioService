package com.microservices.usuarioservice.controllers.v1;

import com.microservices.usuarioservice.controllers.BaseController;
import com.microservices.usuarioservice.application.feature.usuario.command.AgregarUsuarioCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.concurrent.CompletableFuture;

@Tag(name = "Usuario")
@RestController
public class UsuarioController extends BaseController {

    @GetMapping("usuario/listar")
    public String listar() {
        return buildResponse("Listado de usuarios");
    }

    @PostMapping("/crear")
    public String crear(@RequestBody AgregarUsuarioCommand command) {
        return buildResponse("Usuario creado");
    }

    @PostMapping("/actualizar")
    public String actualizar() {
        return buildResponse("Usuario actualizado");
    }

    @PostMapping("/eliminar")
    public String eliminar() {
        return buildResponse("Usuario eliminado");
    }
}
