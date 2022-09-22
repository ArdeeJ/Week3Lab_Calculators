<%-- 
    Document   : arithmeticCalculator
    Created on : 21-Sep-2022, 11:45:05 AM
    Author     : ardee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            
        First: <input type="text" value="${first}">
        <br>
        Last: <input type="text" value="${last}">
        <br>
        <input type="submit" value="+">
        <input type="submit" value="-">
        <input type="submit" value="*">
        <input type="submit" value="%">
        <br>
        Result: ${result}
        <br>
        <a href ="age"> Age Calculator</a> 
    </body>
</html>
