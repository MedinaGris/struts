package struts.edu.mx.model;

import java.util.List;
import struts.edu.mx.entity.Usuario;

public interface IUsuarioModel {

    public void crearRegistro(Usuario usuario);

    public void eliminarRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public Usuario obtenerRegistro(Integer id);

    public List<Usuario> obtenerRegistros ();

}
