<%-- 
    Document   : vista
    Created on : 05-nov-2018, 16:14:29
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
        <h1>Resultado</h1>
        <%
            /*Opcion 1*/
            String name = (String) request.getAttribute("namejsp");
            String apellido = (String) request.getAttribute("apellidojsp");
            Integer edad = (Integer) request.getAttribute("edadjsp");
            String pass = (String) request.getAttribute("passjsp");
            
            /*Opcion 2*/
            Persona persona = (Persona)request.getAttribute("personajsp");
        %>
        <!-- Opcion 1 -->
        <ul>
            <li>Nombre: <%=name%></li>
            <li>Apellido: <%=apellido%></li>
            <li>Edad: <%=edad%></li>
            <li>Contraseña: <%=pass%></li>
        </ul>
        <a href="index.html">Volver</a>
        <!-- Opcion 2 -->
        <ul>
            <li>Nombre: <%=persona.getNombre()%></li>
            <li>Apellido: <%=persona.getApellido()%></li>
            <li>Edad: <%=persona.getEdad()%></li>
        </ul>
    </body>
</html>
