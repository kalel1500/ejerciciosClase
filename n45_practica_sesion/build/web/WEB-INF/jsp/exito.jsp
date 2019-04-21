<%-- 
    Document   : exito
    Created on : 06-feb-2019, 20:02:29
    Author     : Usuario
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${sessionScope.nom == null}">
            <% response.sendRedirect("login"); %>
        </c:if>
        <h1>Bienvenido ${nom}</h1>
        
        <a href="login">login</a>
        <br>
        <a href="logout">Cerrar Sesion</a>
    </body>
</html>
