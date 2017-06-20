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
    <title>修改表单</title>
</head>
<body>
<h1>
     根据id对对应用户进行修改
</h1>
<form action="user_alter_successful.jsp" method="post">
    <h2>用户修改表单</h2>
    <hr/>
    ID:<input type="text" name="id" /></br>
    PASSWORD:<input type="password" name="password" /></br>
    Name:<input type="text" name="name" /></br>
    Email:<input type="text" name="email" /></br>
    <input type="submit" value="修改" />
</form>
</body>
</html>
