<%-- 
    Document   : vistaResultado.jsp
    Created on : 15-oct-2018, 16:41:06
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
        <h1>Resultado</h1>
        <% int res = (int)request.getAttribute("resultado"); %>
        <% int numero2 = (int)request.getAttribute("numero2"); %>
        <% int operacion = (int)request.getAttribute("operacion"); %>
        <%
                switch (operacion) {
                    case 1 :
                        %><h3>Suma:</h3><%
                    break;
                    case 2 :
                        %><h3>Resta:</h3><%
                    break;
                    case 3 :
                        %><h3>Multimplicacion:</h3><%
                    break;
                    case 4 :
                        %><h3>Division:</h3><%
                    break;
                }
            %>
        <%
            if (numero2 == 0) {
                %>No se puede dividir entre 0<br><%
            } else {
                %>El resultado es:  <%= res %><br><%
            }
        %>
        
        
        <a href="index.html">Pulsa para volver al Index</a>
    </body>
</html>
