package struts.edu.mx.model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import struts.edu.mx.entity.Usuario;

public class UsuarioModelImpl implements IUsuarioModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Usuario usuario) {

        try {
            //Inicializar la fabrica de sesiones
            sf = new Configuration().configure().buildSessionFactory(); //Hibernate.dfg.xml
            //Inicializar la sesion
            s = sf.openSession();
            //Inicializar la transaccion
            s.getTransaction().begin();
            //Guardar el registro
            s.save(usuario);
            //Hacer el commit para almacenar en la base de datos
            s.getTransaction().commit();
            //Cerrar la sesion
            s.close();
            //Cerrar la fabrica de sesiones
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e);
        }

    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            //Inicializar la fabrica de sesiones
            sf = new Configuration().configure().buildSessionFactory(); //Hibernate.dfg.xml
            //Inicializar la sesion
            s = sf.openSession();
            //Inicializar la transaccion
            s.getTransaction().begin();
            //Guardar el registro
            s.delete(usuario);
            //Hacer el commit para almacenar en la base de datos
            s.getTransaction().commit();
            //Cerrar la sesion
            s.close();
            //Cerrar la fabrica de sesiones
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            //Inicializar la fabrica de sesiones
            sf = new Configuration().configure().buildSessionFactory(); //Hibernate.dfg.xml
            //Inicializar la sesion
            s = sf.openSession();
            //Inicializar la transaccion
            s.getTransaction().begin();
            //Guardar el registro
            s.update(usuario);
            //Hacer el commit para almacenar en la base de datos
            s.getTransaction().commit();
            //Cerrar la sesion
            s.close();
            //Cerrar la fabrica de sesiones
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public Usuario obtenerRegistro(Integer id) {
        Usuario usuario = null;
        try {
            //Inicializar la fabrica de sesiones
            sf = new Configuration().configure().buildSessionFactory(); //Hibernate.dfg.xml
            //Inicializar la sesion
            s = sf.openSession();
            //Obtener un registro
            usuario = s.get(Usuario.class, id);
            //Cerrar la sesion
            s.close();
            //Cerrar la fabrica de sesiones
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listausuario = null;
        try {
            //Inicializar la fabrica de sesiones
            sf = new Configuration().configure().buildSessionFactory(); //Hibernate.dfg.xml
            //Inicializar la sesion
            s = sf.openSession();
            //Obtener una lsta de registros
            listausuario = s.createCriteria(Usuario.class).list();
            //Cerrar la sesion
            s.close();
            //Cerrar la fabrica de sesiones
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listausuario;
    }

}
