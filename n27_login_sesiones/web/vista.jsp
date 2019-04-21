<%-- 
    Document   : vista
    Created on : 06-nov-2018, 16:43:12
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
        <h1>Resultado</h1>
        <%
            boolean pasa = false;
            HttpSession misesion = (HttpSession) request.getSession();
            
            
            
            if(misesion.getAttribute("nombre")!=null) {
                pasa = true;
            }
            if(pasa == true) { %>
                <h2>Correcto!!</h2>
                <p>Hola <%= misesion.getAttribute("nombre") %></p>
            <% } else {
                response.sendRedirect("index.html");
                %><a href="loginController">Cerrar sesion</a><%
            }
        %>
        
       
    </body>
</html>
