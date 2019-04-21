<%-- 
    Document   : modificarPersona
    Created on : 16-ene-2019, 17:06:53
    Author     : Usuario
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar persona</title>
    </head>
    <body>
        <h1>Insertar persona</h1>
        <form:form modelAttribute="persona" action="modificarPersona" method="POST">
            Nombre:
            <form:input path="nombre_persona"/> <br/>
            Password:
            <form:input path="password_persona"/> <br/>
            Email:
            <form:input path="email_persona"/> <br/>
            
            <form:hidden path="id_persona" />
            <input type="submit" value="Enviar"/>
        </form:form>
            
            <a href="index">index</a>
    </body>
</html>
