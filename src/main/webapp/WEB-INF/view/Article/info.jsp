
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章详情</title>
</head>
<body>
    <h1>${article.mainTitle}</h1>
    <hr>
    <h3>${article.subTitle}</h3>
    <div>
        ${article.articleImg}
        ${article.content}
    </div>
    <p>作者：${a.users.userInfo.nickName}</p>
    <p>发布日期：<fmt:formatDate value="${a.sendDate}" pattern="yyyy-MM-dd" /></p>
</body>
</html>
