public class UsuarioUseCase implements IUsuarioUseCase {
    private final IUsuarioCommand usuarioCommand;

    public UsuarioUseCase(IUsuarioCommand usuarioCommand) {
        this.usuarioCommand = usuarioCommand;
    }

    public boolean CrearUsuario(CrearUsuarioCommand request) {

        //Filtrar antes de ejecutar la logica accion
        // Lógica para crear un usuario
        System.out.println("Usuario creado: " + request.getNombre() + ", " + request.getEmail());
        usuarioCommand.CrearUsuario(request.getNombre(), request.getEmail());
        return true;
    }
}
