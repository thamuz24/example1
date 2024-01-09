<%--
  Created by IntelliJ IDEA.
  User: falle
  Date: 12/25/2023
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h2>chose your sandwich condiments</h2>
    <form>
      <label for="lettuce">lettuce</label>
      <input type="checkbox" id="lettuce" name="lettuce" value="lettuce">
        <label for="tomato">tomato</label>
      <input type="checkbox" id="tomato" name="tomato" value="tomato">
        <label for="mustard">mustard</label>
      <input type="checkbox" id="mustard" name="mustard" value="mustard">
        <label for="sprouts">sprouts</label>
      <input type="checkbox" id="sprouts" name="sprouts" value="sprouts">
        <input type="submit" value="save">
    </form>
</div>
</body>
</html>
