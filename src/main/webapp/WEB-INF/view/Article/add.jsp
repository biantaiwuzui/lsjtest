<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/24
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加文章</title>
</head>
<body>
<from:form action="/article/add" modelAttribute="article" method="post" enctype="multipart/form-data">
    <p>主标题：<input type="text" name="mainTitle" /></p>
    <p>  副标题：<input type="text" name="subTitle" /></p>
    <p>  内容：<input type="text" name="content" /></p>
    <p>  图片：<input type="file" name="file" /></p>
    <input type="submit" value="提交" />
</from:form>
</body>
</html>
