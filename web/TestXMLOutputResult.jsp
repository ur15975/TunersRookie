<%@ page import="com.clx.xml.XMLOutput" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<jsp:useBean id="xmlOut" class="com.clx.xml.XMLOutput"/>
<body>
Success
<%
    out.print(new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8"));
    String name = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
    XMLOutput.setRootElement(name);
%>
</body>
</html>