<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.clx.xml.XML" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="xml" class="com.clx.xml.XML"/>

<body>
<form method="post" action="TestOutputResult.jsp" target="_blank">
    姓名：<input type="text" name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>