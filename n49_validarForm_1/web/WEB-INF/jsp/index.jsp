<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css" type="text/css" media="all" />
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
        <!-- Añadimos el Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <script type="text/javascript">

//            $(document).ready(function () {
//                $("#boton").click(function () {
//                    //alert("hola");
//                    var pasar = true
//                    if ($("#nombre").val() === "") {
//                        $("#error_nombre").html("Ingrese username desde cliente");
//                        pasar = false;
//                    } else {
//                        $("#error_nombre").html("");
//                    }
//
//                    if ($("#password").val() === "") {
//                        $("#error_password").html("Ingrese password desde cliente");
//                        pasar = false;
//                    } else {
//                        $("#error_password").html("");
//                    }
//
//                    if ($("#email").val() === "") {
//                        $("#error_email").html("Ingrese email desde cliente");
//                        pasar = false;
//                    } else {
//                        $("#error_email").html("");
//                    }
//                    return pasar;
//                });
//            });
        </script>
    </head>

    <body>
        <h1>Formulario</h1>
        <form:form method="POST" modelAttribute="persona" action="index">
            <table>
                <tr>
                    <td><b>Username:</b></td>
                    <td><form:input class="form-control" path="nombre" /></td>
                    <td><form:errors path="nombre" style="color: red;" /></td>
                    <td><span id="error_nombre" style="color: red;"></span></td>
                </tr>
                <tr>
                    <td><b>Password:</b></td>
                    <td><form:password class="form-control" path="password" /></td>
                    <td><form:errors path="password" style="color: red;" /></td>
                    <td><span id="error_password" style="color: red;"></span></td>
                </tr>
                <tr>
                    <td><b>Email:</b></td>
                    <td><form:input class="form-control" path="email"  /></td>
                    <td><form:errors path="email" style="color: red;" /></td>
                    <td><span id="error_email" style="color: red;"></span></td>
                    <td><span id="error_email2" style="color: green;"></span></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" class="btn btn-warning" value="Registrar" id="boton" /></td>                    
                </tr>
            </table>
        </form:form>

        <script type="text/javascript">
            $('#email').keyup(
                    function () {
                        $('#error_email2').load('disponibleemail',
                                "email="+$('#email').val());

                    }
            );
        </script>
    </body>
</html>
