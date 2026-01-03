@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController extends BaseController {

    @GetMapping
    public Object listar() {
        return send(new ObtenerUsuariosQuery());
    }
}
