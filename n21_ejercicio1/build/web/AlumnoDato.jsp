<%-- 
    Document   : AlumnoDato
    Created on : 17-oct-2018, 20:30:44
    Author     : Usuario
--%>

<%@page import="model.Alumno"%>
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
            Alumno aluLocal = (Alumno)request.getAttribute("alujsp");
        %>
        <p>Nombre: <%= aluLocal.getNombre()%> </p>
        <p>Apellido: <%= aluLocal.getApellido()%> </p>
        <p>Edad: <%= aluLocal.getEdad()%> </p>
        <p>Telefono: <%= aluLocal.getTelefono()%> </p>
        <p>Matricula: <%= aluLocal.getMatricula()%> </p>
        <!-- <p>Notas: <%= aluLocal.getNotas()%> </p> -->
        <a href="index.html">Volver</a>
    </body>
</html>
