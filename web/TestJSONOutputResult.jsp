<%@ page import="com.clx.json.JSONOutput" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
Success</br>
<%
    String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
    String time = new String(request.getParameter("time").getBytes("ISO-8859-1"), "UTF-8");
    String avatar = new String(request.getParameter("avatar").getBytes("ISO-8859-1"), "UTF-8");
    String action = new String(request.getParameter("action").getBytes("ISO-8859-1"), "UTF-8");

    JSONOutput.setElement(name,avatar,action,time);
%>
</body>
</html>