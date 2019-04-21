<%-- 
    Document   : formulario
    Created on : 17-dic-2018, 16:27:20
    Author     : Usuario
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Esto es busquedaOfertas.jsp</title>
    </head>
    <body>
        <form:form modelAttribute="persona" action="presentacion" method="POST">
            Nombre:
            <form:input path="nombre"/> <br/>
            Edad:
            <form:input path="edad"/> <br/>
            
            <input type="submit" value="buscar"/>
        </form:form>
            
        <a href="index">index</a>
    </body>
</html>    
