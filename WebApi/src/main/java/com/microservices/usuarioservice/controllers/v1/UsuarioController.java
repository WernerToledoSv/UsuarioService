package com.microservices.usuarioservice.controllers.v1;

import com.microservices.usuarioservice.application.feature.usuario.commands.AgregarUsuarioCommand;
import com.microservices.usuarioservice.controllers.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Usuario")
@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController extends BaseController {

    public UsuarioController(CommandGateway commandGateway, QueryGateway queryGateway) {
        super(commandGateway, queryGateway);
    }

    @GetMapping("/listar")
    public String listar() {
        return buildResponse("Listado de usuarios");
    }

    @PostMapping("/crear")
    public String crear(@RequestBody AgregarUsuarioCommand command) {
        sendCommand(command);
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