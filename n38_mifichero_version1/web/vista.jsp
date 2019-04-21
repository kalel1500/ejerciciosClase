<%-- 
    Document   : vista
    Created on : 05-dic-2018, 18:09:13
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
        <h1>Fichero guardado correctamente</h1>
        
        <%
            String texto = (String)request.getAttribute("texto");
        %>
        <%= texto %>//
        
        <%
//            Persona miPersona = (Persona)request.getAttribute("texto");
//            String mensaje1 = "";
//            mensaje1 = "Tiene 2 soluciones y son: " + miecujsp1.getA() + " y " + miecujsp1.getB();
        %>
        <%= // mensaje1 %>
        
        
        <br><br><br>
        <a href="index.html">Volver</a>
    </body>
</html>
