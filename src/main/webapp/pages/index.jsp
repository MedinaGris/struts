
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="/bootstrap.bundle.min.js"></script> 
        <script src="/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="resources/boots/bootstrap.min.css" type="text/css">
    </head>
    <body>
        <h1>Pagina Principal!</h1>
        <s:a href="actionPrincipal">Listar registro</s:a>
            <br>
            <br>
        <s:a href="crearRegistroformulario">Crear Registro</s:a>
    </body>
</html>
