<%-- 
    Document   : recibir
    Created on : 14-nov-2018, 19:41:30
    Author     : Usuario
--%>

<%@page import="model.Soleqsegongraucompl"%>
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
            Soleqsegongraucompl miecujsp = (Soleqsegongraucompl)request.getAttribute("miecu");
            String mensaje = "";
            String solucion1;
            String solucion2;
            if (miecujsp.getNumsolu() == 0) {
                mensaje = "No tiene solucion";
            }
            if (miecujsp.getNumsolu() == 1) {
                mensaje = "Tiene 1 solucion y es: " + miecujsp.getSol1();
            }
            if (miecujsp.getNumsolu() == 1) {
                mensaje = "Tiene 2 soluciones y son: " + miecujsp.getSol1() + " y " + miecujsp.getSol2();
            }
        %>
        <%= mensaje %>
        <!-- No va-->
        ${miecujsp.getNumsolu()}
    </body>
</html>
