package struts.edu.mx.controller.base;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import struts.edu.mx.entity.base.IRegistroEntityBase;
import struts.edu.mx.service.base.IRegistroServiceBase;

public class RegistroControllerBase<T extends IRegistroEntityBase> extends ActionSupport {

    private List<T> listaRegistro;
    public T registro;
    public IRegistroServiceBase service;

    //Operación create
    public List<T> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(List<T> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }

    public String crearRegistro() {

        if (registro.getId() > 0) {
            service.actualizarRegistro(registro);
        } else {
            service.crearRegistro(registro);
        }
        System.out.println("registro__________________________"+registro.getId());
        resetItemList();

        return "success";
    }

    //Cargar la lista de registros
    protected void resetItemList() {
        listaRegistro = new ArrayList<>();
        listaRegistro = service.obtenerRegistros();

    }

    public String eliminarRegistro() {
        service.eliminarRegistro(registro);
        resetItemList();
        return "success";
    }

    public T getRegistro() {
        return registro;
    }

    public void setRegistro(T registro) {
        this.registro = registro;
    }

    public void setService(IRegistroServiceBase service) {
        this.service = service;
    }
}
