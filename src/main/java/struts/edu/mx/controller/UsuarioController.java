package struts.edu.mx.controller;

import struts.edu.mx.controller.base.RegistroControllerBase;
import struts.edu.mx.entity.Usuario;
import struts.edu.mx.service.IUsuarioService;
import struts.edu.mx.service.UsuarioServiceImpl;

public class UsuarioController extends RegistroControllerBase<Usuario> {

    private Usuario usuario;
    private IUsuarioService service;

    public UsuarioController() {
        service = new UsuarioServiceImpl();
        super.setService(service);
        resetItemList();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        super.setRegistro(usuario);
    }

    /*
    
    public static void main(String[] args) {
        System.out.println("llllllllllll");
        Usuario usuario = new Usuario();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        usuario.setNombreUsuario("Luz");
        usuario.setContraseña("1234");
      
        //usuario.setFechaActualizacion(sdf.parse("15/02/2022"));
        //System.out.println("FECHA-----------------------"+sdf.toString());

        UsuarioController controller = new UsuarioController();
        controller.init();
        //Setea el registro en el base
        controller.setRegistro(usuario);
        //Crear el registro en el base
        controller.crearRegistro();
        System.out.println("aaaaaaaaaaaa");
    }*/
}
