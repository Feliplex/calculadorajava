<%-- 
    Document   : form-calculadora
    Created on : 07/12/2018, 00:16:07
    Author     : Junior Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
        <link href="/calculadora-java-web/css/css.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <h1>Calculadora!</h1>
        <form method="GET" action="/calculadora-java-web/servlet-calculadora">
            Valor 1: <input type="text" name="n1"/>
            Valor 2: <input type="text" name="n2"/>
            
            Resultado: <%=request.getAttribute("resultado")%>
                        
            <button type="submit" name="operacao" name="soma">Somar</button>
            <button type="submit" name="operacao" name="subtrair">Subtrair</button>
            <button type="submit" name="operacao" name="multiplicar">Multiplicar</button>
            <button type="submit" name="operacao" name="dividir">Dividir</button>
        </form>
        
    </body>
</html>
