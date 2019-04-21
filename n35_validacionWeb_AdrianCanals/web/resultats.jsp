<%-- 
    Document   : resultats
    Created on : 19-nov-2018, 16:28:08
    Author     : Usuario
--%>

<%@page import="model.Soleqsegongrauincompleta1"%>
<%@page import="model.Soleqsegongrauincompleta2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1>Numeros Introducidos</h1>
        <%
            double numero1 = (double)request.getAttribute("num1");
            double numero2 = (double)request.getAttribute("num2");
            double numero3 = (double)request.getAttribute("num3");
        %>
        <%= numero1 %>//
        <%= numero2 %>//
        <%= numero3 %>//
        
        <%
            if (numero3 == 0) {
                %><h1>Resultado Incompleta 1</h1><%
                Soleqsegongrauincompleta1 miecujsp1 = (Soleqsegongrauincompleta1)request.getAttribute("miecu1");
                String mensaje1 = "";
                if (miecujsp1.getNumsolu() == 0) {
                    mensaje1 = "No tiene solucion";
                }
                if (miecujsp1.getNumsolu() == 1) {
                    mensaje1 = "Tiene 1 solucion y es: " + miecujsp1.getA();
                }
                if (miecujsp1.getNumsolu() == 2) {
                    mensaje1 = "Tiene 2 soluciones y son: " + miecujsp1.getA() + " y " + miecujsp1.getB();
                }
                %>
                <%= mensaje1 %>
                <%
            }

            if (numero2 == 0) {
                %><h1>Resultado Incompleta 2</h1><%
                Soleqsegongrauincompleta2 miecujsp2 = (Soleqsegongrauincompleta2)request.getAttribute("miecu2");
                String mensaje2 = "";
                if (miecujsp2.getNumsolu() == 0) {
                    mensaje2 = "No tiene solucion";
                }
                if (miecujsp2.getNumsolu() == 1) {
                    mensaje2 = "Tiene 1 solucion y es: " + miecujsp2.getA();
                }
                if (miecujsp2.getNumsolu() == 2) {
                    mensaje2 = "Tiene 2 soluciones y son: " + miecujsp2.getA() + " y " + miecujsp2.getB();
                }
                %>
                <%= mensaje2 %>
                <%
            }
        %>
        
        
        <br><br><br>
        <a href="index.html">Volver</a>
    </body>
</html>
