
<%@taglib prefix="s" uri= "/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.cs"/>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear Usuario</h1>
    <s:form action="" method="POST">
        <s:textfield name="usuario.nombreUsuario"
                     size="200px"
                     placeholder="Ingresar el nombre"
                     ></s:textfield>
        
        <s:textfield name="usuario.contrase\u00f1a"
                     size="200px"
                     placeholder="Ingresa la contraseña"
                     ></s:textfield>
        
          <s:textfield name="usuario.fechaCreacion"
                     size="200px"
                     placeholder="Fecha de creación"
                     ></s:textfield>
        
          <s:textfield name="usuario.fechaActualizacion"
                     size="200px"
                     placeholder="Fecha de actualización"
                     ></s:textfield>
        
          <s:textfield name="usuario.fechaEliminacion"
                     size="200px"
                     placeholder="Fecha de eliminación"
                     ></s:textfield>
        
        <s:submit value="Crear Registro" action="crearRegistro"></s:submit>
        
        
        
    </s:form>
    </body>
</html>
