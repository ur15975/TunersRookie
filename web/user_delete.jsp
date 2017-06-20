<%--
  Created by IntelliJ IDEA.
  User: ur15975@outlook.com
  Date: 2017/6/20
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
<h1>
    根据id对对应用户进行删除
</h1>
<form action="user_delete_successful.jsp" method="post">
    <h2>用户删除表单</h2>
    ID:<input type="text" name="id" /></br>
    <input type="submit" value="删除">
</form>
</body>
</html>
