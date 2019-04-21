<%-- 
    Document   : vista
    Created on : 05-nov-2018, 17:41:39
    Author     : Usuario
--%>

<%@page import="model.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
                table {
                        border: 1px solid black;
                }
                tr {
                        border: 1px solid black;
                }
                th {
                        border: 1px solid black;
                }
                td {
                        border: 1px solid black;
                }
        </style>
    </head>
    <body>
        <h1>Resultado</h1>
        <%
            
            Persona persona = (Persona)request.getAttribute("personajsp");
        %>
        
        <!-- Opcion 2 -->
        <ul>
            <li>Contador: <%=persona.getContador()%></li>
            <li>Nombre: <%=persona.getNombre()%></li>
            <li>Numero hijos: <%=persona.getNumeroHijos()%></li>
            <li>Telefono: <%=persona.getTelefono()%></li>
            <li>Nombre hijo 1: <%=persona.getNombreHijo1()%></li>
            <li>Nombre hijo 2: <%=persona.getNombreHijo2()%></li>
            <li>Cuenta bancarea: <%=persona.getCuentaBancarea()%></li>
            <li>Titulacion: <%=persona.getTitulacion()%></li>
            <li>Edad: <%=persona.getEdad()%></li>
            <li>Sueldo: <%=persona.getSueldo()%></li>
        </ul>
        
        <table>
            <thead>
                <tr>
                    <td>Contador</td>
                    <td>Nombre</td>
                    <td>Numero hijos</td>
                    <td>Telefono</td>
                    <td>Nombre hijo 1</td>
                    <td>Nombre hijo 2</td>
                    <td>Cuenta bancarea</td>
                    <td>Titulacion</td>
                    <td>Edad</td>
                    <td>Sueldo</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=persona.getContador()%></td>
                    <td><%=persona.getNombre()%></td>
                    <td><%=persona.getNumeroHijos()%></td>
                    <td><%=persona.getTelefono()%></td>
                    <td><%=persona.getNombreHijo1()%></td>
                    <td><%=persona.getNombreHijo2()%></td>
                    <td><%=persona.getCuentaBancarea()%></td>
                    <td><%=persona.getTitulacion()%></td>
                    <td><%=persona.getEdad()%></td>
                    <td><%=persona.getSueldo()%></td>
                </tr>
            </tbody>
        </table>
        <a href="index.html">Volver</a>
    </body>
</html>
