<%-- 
    Document   : destino
    Created on : 10-oct-2018, 20:18:32
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
        <h1>Hello World!</h1>
        <!-- Recuperar las variabes enviadas por el controller -->
        <% String nombre = (String)request.getAttribute("usuarioJsp"); %>
        <%= nombre %>
    </body>
</html>
