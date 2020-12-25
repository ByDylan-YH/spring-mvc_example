<%--
  Created by IntelliJ IDEA.
  User: BY
  Date: 2020/3/29
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>入门程序</h1>
<%--  <a href="${pageContext.request.contextPath}/hello">入门程序</a>--%>
<%--  <a href="${pageContext.request.contextPath}/param/testParam?username=by&password=123456">请求参数绑定</a>--%>

<%--封装到类当中--%>
<%--<form action="/param/saveAccount" method="post">--%>
<%--    姓名:<input type="text" name="username"/><br/>--%>
<%--    密码:<input type="text" name="password"/><br/>--%>
<%--    用户姓名:<input type="text" name="user.uname"/><br/>--%>
<%--    用户年龄:<input type="text" name="user.age"/><br/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>

<%--封装到集合当中--%>
<%--<form action="/param/saveAccount" method="post">--%>
<%--    姓名:<input type="text" name="username"/><br/>--%>
<%--    密码:<input type="text" name="password"/><br/>--%>
<%--    用户姓名:<input type="text" name="list[0].uname"/><br/>--%>
<%--    用户年龄:<input type="text" name="list[0].age"/><br/>--%>

<%--    用户姓名:<input type="text" name="map['one'].uname"/><br/>--%>
<%--    用户年龄:<input type="text" name="map['one'].age"/><br/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>

<%--自定义类型转换器--%>
<%--<form action="/param/saveUser" method="post">--%>
<%--    用户姓名:<input type="text" name="uname"/><br/>--%>
<%--    用户年龄:<input type="text" name="age"/><br/>--%>
<%--    用户生日:<input type="text" name="date"/><br/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>

<%--<a href="${pageContext.request.contextPath}/param/testServlet">Servlet原生的API</a>--%>

<%--常用的注解--%>
<a href="${pageContext.request.contextPath}/anno/testRequestParam?name=BY">RequestParam</a>

<%--换行符--%>
<br>

<form action="${pageContext.request.contextPath}/anno/testRequestBody" method="post">
    用户姓名:<input type="text" name="uname"/><br/>
    用户年龄:<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>

<a href="${pageContext.request.contextPath}/anno/testPathVariable/10">testPathVariable</a>
<br>
<a href="${pageContext.request.contextPath}/anno/testRequestHeader">testRequestHeader</a>
<br>
<a href="${pageContext.request.contextPath}/anno/testCookieValue">testCookieValue</a>
<br>

<form action="${pageContext.request.contextPath}/anno/testModelAttribute" method="post">
    用户姓名:<input type="text" name="uname"/><br/>
    用户年龄:<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>

<br>
<a href="${pageContext.request.contextPath}/anno/testSessionAttributes">testSessionAttributes</a>
<br>

<a href="${pageContext.request.contextPath}/anno/getSessionAttributes">getSessionAttributes</a>
<br>

<a href="${pageContext.request.contextPath}/anno/delSessionAttributes">delSessionAttributes</a>
<br>
</body>
</html>
