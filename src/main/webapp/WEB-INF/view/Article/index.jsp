<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章详情</title>
</head>
<script src="${pageContext.request.contextPath}/assets/javascript/jquery-1.7.2.js"></script>
<body>
    <table border="1px">
        <tr>
            <td>标题</td>
            <td>作者</td>
            <td>文章类型</td>
            <td>添加时间</td>
            <td>阅读数量</td>
            <td>点赞数量</td>
            <td>评论数量</td>
            <td>显示状态</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${articles}" var="a">
            <tr>
                <td>${a.mainTitle}</td>
                <td>${a.users.userInfo.nickName}</td>
                <td>${a.content}</td>
                <td><fmt:formatDate value="${a.sendDate}" pattern="yyyy-MM-dd" /></td>
                <td>${a.browses[0].browseId ==0 ?  0 : a.browses.size()}</td>
                <td>${a.goodByArticles[0].goodByArticleId == 0 ? 0:a.goodByArticles.size()}</td>
                <td>${a.commentss[0].commentId ==0 ? 0 :a.commentss.size()}</td>
                <td>${a.article_statue == 0 ? '显示':'隐藏'}</td>
                <td><button id="btn1"  onclick="updateStatu(${a.article_statue},${a.articleId})">${a.article_statue == 0 ? '隱藏':'顯示'}</button>&nbsp;
                    <button onclick="del(${a.articleId})">刪除</button>
                </td>
                <td><button onclick="article_info(${a.articleId})">详情</button></td>
            </tr>
        </c:forEach>
    </table>


<script>

    function article_info(id) {
        window.location.href="/article/"+id;
    }


    function updateStatu(article_statue,id) {

        if(article_statue == 0){
            article_statue =1
        }else{
            article_statue =0
        }
        $.ajax({
            url:'${pageContext.request.contextPath}/article/updateStatus/'+article_statue+"/"+id,
            type:'post',
            dataType:'text',
            success:function (data) {
                window.location.href="${pageContext.request.contextPath}/article"
            }
        })
    }

    function del(id){
        if(confirm("你确定要删除这篇文章")){
           $.ajax({
               url:'${pageContext.request.contextPath}/article/del/'+id,
               type:'post',
               dataType:'text',
               success:function (data) {
                   if(confirm("你确定要删除这篇文章")){
                       alert(data);
                       if(data == "del"){
                           alert("删除成功");
                           window.location.href="${pageContext.request.contextPath}/article";
                       }else{
                           alert("操作失误，请 重新操作");
                           window.location.href="${pageContext.request.contextPath}/article";
                       }
                   }
               }
           })
        }else{
            window.location.href="${pageContext.request.contextPath}/article";
        }

    }

</script>
</body>
</html>
