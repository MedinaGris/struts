package struts.edu.mx.service;

import java.util.List;
import struts.edu.mx.entity.Usuario;
import struts.edu.mx.model.IUsuarioModel;
import struts.edu.mx.model.UsuarioModelImpl;

public class UsuarioServiceImpl implements IUsuarioService {

    IUsuarioModel modelo = new UsuarioModelImpl();

    @Override
    public void crearRegistro(Usuario registro) {
        modelo.crearRegistro(registro);
    }

    @Override
    public void eliminarRegistro(Usuario registro) {
        modelo.eliminarRegistro(registro);
    }

    @Override
    public void actualizarRegistro(Usuario registro) {
        modelo.actualizarRegistro(registro);
    }

    @Override
    public void obtenerRegistro(Integer id) {
        modelo.obtenerRegistro(id);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

}
