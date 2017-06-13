<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.clx.xml.XML" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="xml" class="com.clx.xml.XML"/>

<body>
<font  style="size: 100px;font-family: 微软雅黑">
<form method="post" action="TestJSONOutputResult.jsp" target="_blank">
    姓名：<input type="text" name="name"></br>
    头像：<input type="text" name="avatar"></br>
    行为：<input type="text" name="action"></br>
    时间：<input type="text" name="time"></br>
    <input type="submit" value="提交"></br>
</form>
</font>
</body>
</html>