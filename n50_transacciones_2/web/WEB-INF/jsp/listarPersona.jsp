<%-- 
    Document   : listarPersona
    Created on : 14-ene-2019, 16:37:13
    Author     : Usuario
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona</title>
    </head>
    <body>    
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Password</th>
                    <th>Email</th>
                    <th>Eliminar</th>
                    <th>Modificar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="per" items="${listaPersona}">
                    <tr>
                        <td>${per.id_persona}</td>
                        <td>${per.nombre_persona}</td>
                        <td>${per.password_persona}</td>
                        <td>${per.email_persona}</td>
<!--                        <td><a href="eliminar/${per.id_persona}">Eliminar</a></td> Para rutas amigables-->
                        <td><a href="eliminar?id=${per.id_persona}">Eliminar</a></td>
                        <td><a href="modificar?id=${per.id_persona}">Modificar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            
        <a href="index">index</a>
    </body>
</html>
