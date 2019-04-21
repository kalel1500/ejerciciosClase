<%-- 
    Document   : vista
    Created on : 05-dic-2018, 18:09:13
    Author     : Usuario
--%>

<%@page import="model.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fichero guardado correctamente</h1>
        
        <%
            String texto = (String)request.getAttribute("texto");
        %>
        <%= texto %>
        <br><br><br>
        <a href="index.html">Volver</a>
    </body>
</html>
