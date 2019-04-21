<%-- 
    Document   : vistaMensaje.jsp
    Created on : 15-oct-2018, 16:54:30
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
        <h1>Mensaje</h1>
        <% String nombre = request.getParameter("nombre"); %>
        <% String password = request.getParameter("password"); %>
        
        <%
            if (nombre.equals("Pepe") && password.equals("1234")) {
                out.println("El nombre de usuario y la contraseña son CORRECTOS");
                %><br><%
                out.println("Hola señor Pepe");
            } else {
                out.println("No has introducido bien el nombre o la contraseña");                
            }
        %>
        <br>
        <a href="index.html">Pulsa para volver al Index</a>
    </body>
</html>
