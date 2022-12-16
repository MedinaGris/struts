
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
    <s:form action="editarUsuarioAction" method="POST">
           <s:textfield name="usuario.idUsuario"
                     size="200px"
                     
                     ></s:textfield>
        <s:textfield name="usuario.nombreUsuario"
                     size="200px"
                     
                     ></s:textfield>
        
        <s:textfield name="usuario.contrase\u00f1a"
                     size="200px"
                     
                     ></s:textfield>
        
          <s:textfield name="usuario.fechaCreacion"
                     size="200px"
                     
                     ></s:textfield>
        
          <s:textfield name="usuario.fechaActualizacion"
                     size="200px"
                     
                     ></s:textfield>
        
          <s:textfield name="usuario.fechaEliminacion"
                     size="200px"
                     
                     ></s:textfield>
        
        <s:submit value="Actualizar Registro" action="crearRegistro"></s:submit>
        
        
        
    </s:form>
    </body>
</html>
