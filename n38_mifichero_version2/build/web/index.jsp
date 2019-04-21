<%-- 
    Document   : index
    Created on : 05-dic-2018, 20:55:40
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form id="form" action="FicheroController" method="POST">
                <label>Nombre:</label>
                <input type="text" name="nombre" required><br><br>
                
                <label>Edad:</label>
                <input type="number" name="edad" required><br><br>
                
                <label>Poblacion:</label>
                <input type="text" name="poblacion" required><br><br>
                
                <label>Estudios:</label>
                <input type="text" name="estudios" required><br><br>
                
                <input type="submit" value="Enviar">
            </form>
        </div>
    </body>
</html>
