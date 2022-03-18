<%-- 
    Document   : FormularioJSP
    Created on : 19 ene. 2022, 12:44:55
    Author     : curci
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario del cliente</title>
    </head>
    <body>
        <h1>Datos cliente</h1>
        <form action="SvPrueba" method="POST">
            <p><label>DNI:</label><input type="text" name="dni"></p>
            <buttom type="summit">Enviar</buttom>  
        </form>
    </body>
</html>
