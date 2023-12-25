<%--
  Created by IntelliJ IDEA.
  User: falle
  Date: 12/22/2023
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transform Money</title>
</head>
<body>
<form action="/transMoney">
    input your money
    <input type="text" name="word" placeholder="input your word">
    <input type="submit" value="Search">
</form>
<span>
    Money after transform : ${result}
</span>
</body>
</html>
