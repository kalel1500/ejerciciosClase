<%-- 
    Document   : seleccionOperacion
    Created on : 15-oct-2018, 15:57:48
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
        <h1>Selecciona la operacion</h1>
        
        <form action="calculo.jsp">
            <label>Operacion:</label>
            <select name="op">
                <option value="1">suma</option>
                <option value="2">resta</option>
                <option value="3">multiplicacion</option>
                <option value="4">division</option>
            </select>
            <input type="submit" name="Enviar">
        </form>
        <a href="index.html">Pulsa para volver al Index</a>
    </body>
</html>
