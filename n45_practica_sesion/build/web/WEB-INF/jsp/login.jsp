<%-- 
    Document   : login
    Created on : 06-feb-2019, 18:12:08
    Author     : Usuario
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css" type="text/css" media="all" />
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                
                $("#btnSubmit").click(function(){
                    alert ("Llego");
                    alert ($("#nombre").val());
                    if( $("#nombre").val() === ""){
                        $("#error_nombre").html("Ingrese nombre");
                        return false;
                    }else{
                        $("#error_nombre").html("");                        
                    }
                    
                    if( $("#password").val() === ""){
                        $("#error_password").html("Ingrese password");
                        return false;
                    }else{
                        $("#error_password").html("");                        
                    }
                    
                    
                    
                });
                
            });
        </script>
    </head>
    <body>
        <c:if test="${sessionScope.nom != null}">
            <% response.sendRedirect("exito"); %>
        </c:if>
        <h1>Insertar persona</h1>
        <form:form modelAttribute="admin" action="login" method="POST">
            Nombre:
            <form:input path="nombre_administrador"/> <br/>
            Password:
            <form:password path="password_administrador"/> <br/>
            
            <input type="submit" value="Enviar"/>
        </form:form>
        
        <a href="login">login</a>
    </body>
</html>
