<%-- 
    Document   : agecalculator
    Created on : 20-Sep-2022, 7:49:15 PM
    Author     : ardee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${userAge}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}<p>
                <a href ="arithmetic"> Arithmetic Calculator</a> 
    </body>
</html>
