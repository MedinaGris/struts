package struts.edu.mx.controller;

import struts.edu.mx.controller.base.RegistroControllerBase;
import struts.edu.mx.entity.Usuario;
import struts.edu.mx.service.IUsuarioService;
import struts.edu.mx.service.UsuarioServiceImpl;

public class UsuarioController extends RegistroControllerBase<Usuario> {

    //private List<Usuario> listaRegistro;
    private Usuario usuario;
    private IUsuarioService service;

    public UsuarioController() {
        service = new UsuarioServiceImpl();
        super.setService(service);
        resetItemList();
    }

    /*
    public String init() {
        service = new UsuarioServiceImpl();
        super.setService(service);
        super.resetItemList();
        return "success";
        
    }*/

 /*
      public String crearRegistroUsuario() {
        service = new UsuarioServiceImpl();
        super.setService(service);
        service.crearRegistro(usuario);
        super.resetItemList();
        System.out.println("Creando registro...");
        return "success";
    }*/
    public String obtenerRegistroUsuario() {
        System.out.println("obteniendo registro...");
        return "success";
    }

    /*
    public String obtenerRegistroUsuarios() {
        System.out.println("obteniendo lista registros...");
        init();
        //listaRegistro= service.obtenerRegistros();
        return "success";
    }*/
    public String actualizarRegistroUsuario() {
        System.out.println("actualizando registro...");
        return "success";
    }

    /*
    public String eliminarRegistroUsuario() {
        System.out.println("eliminando registro...");
        return "success";
    }*/

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
