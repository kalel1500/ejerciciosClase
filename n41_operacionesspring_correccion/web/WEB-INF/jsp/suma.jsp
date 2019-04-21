<%-- 
    Document   : suma
    Created on : 19-dic-2018, 17:01:32
    Author     : Usuario
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form modelAttribute="opensol" action="suma" method="POST">
            Numero1:
            <form:input path="num1"/> <br/>
            Numero2:
            <form:input path="num2"/> <br/>
            
            <input type="submit" value="enviar"/>
        </form:form>
            
        <a href="index">index</a>
    </body>
</html>
