<%-- 
    Document   : vista
    Created on : 05-nov-2018, 17:41:39
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
            
            Persona persona = (Persona)request.getAttribute("personajsp");
        %>
        
        <!-- Opcion 2 -->
        <ul>
            <li>Nombre: <%=persona.getNombre()%></li>
            <li>Numero hijos: <%=persona.getNumeroHijos()%></li>
            <li>Telefono: <%=persona.getTelefono()%></li>
            <li>Nombre hijo 1: <%=persona.getNombreHijo1()%></li>
            <li>Nombre hijo 2: <%=persona.getNombreHijo2()%></li>
            <li>Cuenta bancarea: <%=persona.getCuentaBancarea()%></li>
            <li>Titulacion: <%=persona.getTitulacion()%></li>
            <li>Edad: <%=persona.getEdad()%></li>
            <li>Sueldo: <%=persona.getSueldo()%></li>
        </ul>
        
        <a href="index.html">Volver</a>
    </body>
</html>
