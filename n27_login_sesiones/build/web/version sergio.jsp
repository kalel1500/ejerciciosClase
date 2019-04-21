<%-- 
    Document   : version sergio
    Created on : 06-nov-2018, 17:10:13
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            boolean pasa = false;
            HttpSession miSesion = (HttpSession) request.getSession();
            
            
            // version de sergio
            if(miSesion.getAttribute("nombre")!=null) {
                pasa = true;
            }
            if(pasa == true) { %>
                <h2>Correcto!!</h2>
                <p>Hola <%= miSesion.getAttribute("nombre") %></p>
            <% } else {
                response.sendRedirect("index.html");
                %><a href="loginController">Cerrar sesion</a><%
            }
        %>
    </body>
</html>
