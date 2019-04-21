<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        
        <a href="segundapagina.htm">link segunda</a><br>
        <a href="tercerapagina.htm">link tercera</a><br>
        <a href="cuartapagina.htm">link cuarta</a><br>
        <a href="quintapagina.htm">link quinta</a><br>
        <a href="sextapagina.htm">link sexta</a><br>
        <a href="septimapagina.htm">link septima</a><br>
        <a href="octavapaginaAnimal.htm">link octava animal</a><br>
        <a href="decimapagina.htm?nom=10">link decima</a><br>
        
        <h2>Formulario</h2>
        <form name="formPersona" action="novenapagina.htm" method="POST">
            <label>Nombre:</label>
            <input type="text" name="nombre" required><br>
            <label>Edad:</label>
            <input type="number" name="edad" required><br>
            <input type="submit" name="Enviar"><br>
        </form>
    </body>
</html>
