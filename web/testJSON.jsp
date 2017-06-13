<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.clx.xml.XML" %>
<%@ page import="com.clx.json.JSON" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="xml" class="com.clx.xml.XML"/>

<body>
<pre><font  style="size: 100px;font-family: 微软雅黑">
    <%
    out.print(JSON.readJson());
    %>
</font>
</pre>
</body>
</html>