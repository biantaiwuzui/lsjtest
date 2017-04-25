<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/20
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加广告</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/advertisement/add" modelAttribute="advertisement" method="post">
    标题：<input type="text" name="advertisementTitle"> <br>
    内容:<input type="text" name="advertisementContent"><br>
    链接：<input type="text" name="advertisingUrl"><br>
    广告联系人:<input type="text" name="advertisingContact"><br>
    广告位置:<input type="text" name="advertisingPosition"><br>
    广告类型:<input type="text" name="advertisingType"><br>
    <input type="submit" value="提交">
</form:form>
</body>
</html>
