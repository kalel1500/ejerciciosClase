<%-- 
    Document   : vistaoperacion
    Created on : 10-oct-2018, 19:49:34
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
        <h1>Hello Adrian</h1>
        <!-- A traves del formulario se envian las variables con el metodo POST -->
        <form action='CrazyController' method='POST'>
            <label> Nombre: </label>
            <input type='text' name='nombre' required><br>
            <label> Numero1: </label>
            <input type='text' name='num1' required><br>
            <label> Numero2: </label>
            <input type='text' name='num2' required><br>
            <input type='hidden' name='operacion' value='suma'>
            <input type='submit' value='Enviar'>
        </form>
    </body>
</html>
