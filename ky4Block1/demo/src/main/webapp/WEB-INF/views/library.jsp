<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: falle
  Date: 12/21/2023
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/translate">
        <input type="text" name="world" placeholder="Enter english world" value="${world}">
        <input type="submit" value="Find">
        <c:if test="${result != null}" >
            <input type="text" value="${result}" readonly>
        </c:if>
        <c:if test="${error != null}">
            <input type="text" value="Not find you world on library" readonly>
        </c:if>
    </form>
</body>
</html>
