<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.pro.ramon.mvc.Temperatura"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle do Aquecedor</title>
    </head>
    <body>
        <h1>Controle do Aquecedor</h1>
        <p>
        <%
            Temperatura aquecedor = (Temperatura) request.getAttribute("aquecedor");
            out.print("A temperatura do aquecedor é " + aquecedor.getT());
        %>
        </p>
        <form action="controle" method="post">
            <input type="submit" name="acao" value="aumentar">
            <input type="submit" name="acao" value="diminuir">
        </form>
    </body>
</html>
