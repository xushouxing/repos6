<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/29 0029
  Time: 下午 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="book/1">查询图书</a><br>
        <form action="book" method="post">
            <input type="submit" value="提交">
        </form>
        <form action="book/2" method="post">
            <input name="_method" value="delete">
            <input type="submit" value="提交">
        </form>
        <form action="book/3" method="post">
            <input name="_method" value="put">
            <input type="submit" value="提交">
        </form>
</body>
</html>
