<%-- 
    Document   : formularioAlumnos
    Created on : 17-oct-2018, 19:59:43
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <form action="AlumnoController" method="POST">
            <label>Nombre:</label>
            <input type="text" name="nombre" required><br>
            <label>Apellido:</label>
            <input type="text" name="apellido" required><br>
            <label>Edad:</label>
            <input type="text" name="edad" required><br>
            <label>Telefono:</label>
            <input type="text" name="telefono" required><br>
            <label>Matricula:<label>
            <input type="text" name="matricula" required><br>
            <label>Notas:</label>
            <input type="text" name="notas" required><br>
            <input type="submit" name="Enviar">
        </form>
    </body>
</html>
