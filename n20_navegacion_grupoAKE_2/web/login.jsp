<%-- 
    Document   : login
    Created on : 15-oct-2018, 15:58:03
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <body>
        <h1>Pagina de login</h1>
        <form action="vistaMensaje.jsp" method="POST">
            <label>Nombre de usuario:</label>
            <input type="text" name="nombre" required>
            <br>
            <label>Contraseña</label>
            <input type="password" name="password" required>
            <br>
            <input type="submit" name="Enviar">
        </form>
        <a href="index.html">Pulsa para volver al Index</a>
    </body>
</html>
