<%--
  Created by IntelliJ IDEA.
  User: chang
  Date: 2023/5/12
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="img"/>
    <input type="submit" value="提交"/>
</form>
<%--<img src="${src}"/>--%>
</body>
</html>
