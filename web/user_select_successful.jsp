<%@ page import="com.clx.hibernate.UserDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.clx.hibernate.User" %><%--
  Created by IntelliJ IDEA.
  User: ur15975@outlook.com
  Date: 2017/6/20
  Time: 8:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:useBean id="obj" class="com.clx.hibernate.User"/>
<jsp:setProperty name="obj" property="*"/>
<pre>
<font size="50px">
<%
    if (obj.getName() != null){
        if (UserDao.selectByName(obj.getName()) != null) {
            List list = UserDao.selectByName(obj.getName());

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
        } else {
            out.println("查无此用户");
        }
    } else if (obj.getEmail() != null) {
        if (UserDao.selectByEmail(obj.getEmail()) != null) {
            List list = UserDao.selectByEmail(obj.getEmail());

            for (Object object : list) {
                User user = (User) object;
                out.print("用户名：");
                out.println(user.getName());
                out.print("密码：");
                out.println(user.getPassword());
                out.print("邮箱：");
                out.println(user.getEmail());
                out.println();
            }
        } else {
            out.println("查无此用户");
        }
    } else {
        out.println("查无此用户");
    }
%>
</font>
</pre>