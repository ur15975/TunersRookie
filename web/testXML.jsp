<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.clx.xml.XML" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="xml" class="com.clx.xml.XML"/>

<body>
<pre><%
    out.print(XML.testGetRoot());
%>
</pre>
</body>
</html>