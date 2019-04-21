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
        <!-- Recuperar las variabes enviadas por el controller -->
        <% String nombre = (String)request.getAttribute("usuarioJsp"); %>
        <% int num1 = (int)request.getAttribute("numero1"); %>
        <% int num2 = (int)request.getAttribute("numero2"); %>
        <% int res = (int)request.getAttribute("resultado"); %>
        <h1>Hola <%= nombre %></h1>
        1. El numero 1 es: <%= num1 %><br>
        2. El numero 2 es: <%= num2 %><br>
        3. La suma es: <%= res %><br>
        4. <%= num1 %> + <%= num2 %> = <%= res %>
    </body>
</html>
