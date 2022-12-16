
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.2/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/font-awesome.4.7.0.css">
    </head>
    <body>
        <h1>Listar Usuario</h1>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>id</th>+
                        <th>nombre</th>
                        <th>contraseña</th>
                        <th>Fecha creación</th>
                        <th>Fecha Actualización</th>
                        <th>Fecha Eliminación</th>
                        <th>Operaciones</th>

                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="listaRegistro"
                                var= "registro"
                                status= "estado">
                        <tr>
                            <td>
                                <s:property value="idUsuario"></s:property>
                                </td>
                                <td>
                                <s:property value="nombreUsuario"></s:property>
                                </td>
                                <td>
                                <s:property value="contraseña"></s:property>
                                </td>
                                <td>
                                <s:property value="fechaCreacion"></s:property>
                                </td>

                                <td>
                                <s:property value="fechaActualizacion"></s:property>
                                </td>
                                <td>
                                <s:property value="fechaEliminacion"></s:property>
                                </td>

                                <td>
                                <s:a action="editarUsuarioActionForm">
                                    <s:param name="usuario.idUsuario" value="idUsuario">

                                    </s:param>
                                    <s:param name="usuario.nombreUsuario" value="nombreUsuario">

                                    </s:param>
                                    
                                    <span>Editar</span>
                                </s:a>
                                    
                                <s:a action="eliminarRegistro">
                                    <s:param name="usuario.idUsuario" value="idUsuario">

                                    </s:param>
                                    <span>Eliminar</span>
                                </s:a>
                            </td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>
    </body>
</html>
