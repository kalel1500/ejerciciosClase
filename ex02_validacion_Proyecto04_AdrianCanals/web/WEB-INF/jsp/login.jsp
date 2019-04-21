<%-- 
    Document   : login
    Created on : 08-abr-2019, 16:18:12
    Author     : Usuario
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${sessionScope.us != null}">
    <% response.sendRedirect("exito");%>
</c:if>

<% String title = (String) request.getAttribute("title"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>${title}</title>
        <link rel="icon" type="image/png" href="img/otros/logo.jpeg"/>
        
        <!--Librerias bootstrap-->
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" ></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <!--Librerias letas-->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
        
        <!--css y js propios-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css" type="text/css" media="all" />
        <script src="${pageContext.request.contextPath}/js/js.js"></script>
    </head>

    <body>
        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <h1>Login</h1>
                    </div>
                </div>

                <form:form class="form-horizontal form-con-fondo" modelAttribute="admin" action="login" method="POST">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="admin_correo">Email:</label>
                        <div class="col-sm-10">
                            <form:input type="email" path="admin_correo" class="form-control"/>
                            <form:errors path="admin_correo" style="color: red;" />
                            <span id="err_admin_correo" style="color: red;"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2" for="admin_password">Password:</label>
                        <div class="col-sm-10">
                            <form:input type="password" path="admin_password" class="form-control"/>
                            <form:errors path="admin_password" style="color: red;" />
                            <span id="err_admin_password" style="color: red;"></span>
                        </div>
                    </div>

                    <c:if test="${msgLogin eq 'incorrecto'}">
                        <div class="col-md-12 text-center alert alert-danger">
                        <span style="color: red;"> El usuario o la contraseña son incorrectos</span>
                        </div>
                    </c:if>

                    <form:input path="admin_edad" type="hidden" />

                    <div class="form-group">        
                        <div class="col-sm-offset-2 col-sm-10">
                            <input type="submit" class="btn btn-default" value="Enviar"/>
                        </div>
                    </div>

                </form:form>
            </div>
    
            <footer>

            </footer>
        </section>
    </body>
</html>