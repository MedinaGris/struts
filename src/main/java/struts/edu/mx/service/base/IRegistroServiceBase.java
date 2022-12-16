package struts.edu.mx.service.base;
//Interfaz genérica para la capa servicio

import java.util.List;


public interface IRegistroServiceBase<T> {

    public void crearRegistro(T registro);

    public void eliminarRegistro(T registro);

    public void actualizarRegistro(T registro);

    public void obtenerRegistro(Integer id);

    public List<T> obtenerRegistros();

}
