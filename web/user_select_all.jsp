<%@ page import="com.clx.hibernate.UserDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.clx.hibernate.User" %><%--
  Created by IntelliJ IDEA.
  User: ur15975@outlook.com
  Date: 2017/6/20
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询所有用户</title>
</head>
<body>
<pre>
<font size="50px">
<%
    List list = UserDao.selectAll();
    for (Object object : list) {
        User user = (User) object;
        out.print("ID：");
        out.println(user.getId());
        out.print("用户名：");
        out.println(user.getName());
        out.print("密码：");
        out.println(user.getPassword());
        out.print("邮箱：");
        out.println(user.getEmail());
        out.println();
    }
%>
</font>
</pre>
</body>
</html>
