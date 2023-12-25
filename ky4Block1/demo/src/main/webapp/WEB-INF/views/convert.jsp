<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: falle
  Date: 12/21/2023
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
    <form action="/convert" method="post">
      <input type="number" name="money" placeholder="USD" value="${money}">
      <input type="number" name="ratio" placeholder="Tỉ giá" value="${ratio}">
      <input type="submit" value="Chuyển đổi">
    </form>

    <c:if test="${not empty result}">
      <input type="text" readonly value="${result}">
    </c:if>
</body>
</html>
