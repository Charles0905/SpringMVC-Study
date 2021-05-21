<%--
  Created by IntelliJ IDEA.
  User: Charles
  Date: 2021/5/20
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>First springmvc project</p>
    <p><a href="user/some.do">发起some.do的get请求</a> </p>
    <br/>
    <form action="user/other.do" method="post">
        <input type="submit" value="post请求other.do">
    </form>

    <p><a href="user/other.do">发起other.do的post请求</a> </p>

    <p><a href="user/other.do">发起first.do的默认请求</a> </p>
</body>
</html>
