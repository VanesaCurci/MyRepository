<%-- 
    Document   : Formulario
    Created on : 19 ene. 2022, 16:27:58
    Author     : curci
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvPrueba" method="POST">
            <p><label>DNI:</label><input type="text" name="dni"></p>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
