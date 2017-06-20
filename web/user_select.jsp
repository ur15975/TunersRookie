<%--
  Created by IntelliJ IDEA.
  User: ur15975@outlook.com
  Date: 2017/6/20
  Time: 8:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询表单</title>
</head>
<body>
<h1>
    不需全部填写，如填写多项根据用户名进行查询
</h1>
<form action="user_select_successful.jsp" method="post">
    <h2>用户查询表单</h2>
    <hr/>
    Name:<input type="text" name="name" /><br>
    <br /> Email:<input type="text" name="email" /><br>
    <br /> <input type="submit" value="查询" />
</form>
<a href="user_select_all.jsp">查询所有用户</a>
</body>
</html>
