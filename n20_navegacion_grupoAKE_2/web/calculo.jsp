<%-- 
    Document   : calculo.jsp
    Created on : 15-oct-2018, 16:08:37
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <body>
        <h1>Introduce los numeros</h1>
        <form action="ControladorOperacion">
            <% String op = request.getParameter("op"); %>
            <% int operacion = Integer.parseInt(op); %>
            <%
                switch (operacion) {
                    case 1 :
                        %><h2>Suma:</h2><%
                    break;
                    case 2 :
                        %><h2>Resta:</h2><%
                    break;
                    case 3 :
                        %><h2>Multimplicacion:</h2><%
                    break;
                    case 4 :
                        %><h2>Division:</h2><%
                    break;
                }
            %>
            <br>
            <label>Numero 1:</label>
            <input type="number" name="num1" required>
            <br>
            <label>Numero 2:</label>
            <input type="number" name="num2" required>
            <input type="hidden" name="op" value="<%= operacion %>">
            <br>
            <input type="submit" name="Enviar">
        </form>
        <a href="index.html">Pulsa para volver al Index</a>
    </body>
</html>
