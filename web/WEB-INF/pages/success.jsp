<%--
  Created by IntelliJ IDEA.
  User: BY
  Date: 2020/3/29
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>成功页面</h1>

<%--AnnoController @SessionAttributes--%>
<%--没有在类上加注解--%>
<%--${requestScope.test}--%>
<%--在类上加注解--%>
<%--${sessionScope}--%>

<%-- UserController 返回值String--%>
${user.uname}
${user.age}
${user.date}
</body>
</html>
