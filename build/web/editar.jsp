<%-- 
    Document   : editar
    Created on : 4 abr. 2023, 20:12:08
    Author     : PC-SOFT-20
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de datos</h1>
        <form action="MainController" method="POST">
            <label>ID</label>
            <input type="text" name="id"> <br>
            
            <label>Nombre</label>
            <input type="text" name="nombres"><br>
            
            <label>Apellidos</label>
            <input type="text" name="apellidos"><br>
            
            <label>Edad</label>
            <input type="text" name="edad"><br>
            
            <input type="submit" value="Enviar">
            
        </form>
        
    </body>
</html>
