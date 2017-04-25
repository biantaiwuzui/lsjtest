<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>广告主页面</title>
</head>
<script src="${pageContext.request.contextPath}/assets/javascript/jquery-1.7.2.js"></script>
<body>
    <table>
        <tr>
            <td>广告图片</td>
            <td>广告标题</td>
            <td>广告内容</td>
            <td>广告链接</td>
            <td>广告联系人</td>
            <td>广告位置</td>
            <td>广告类型</td>
            <td>操作</td>>
        </tr>
    <c:forEach items="${advertisements}" var="a">
        <tr>
            <td>${a.advertisementImg}</td>
            <td>${a.advertisementTitle}</td>
            <td>${a.advertisementContent}</td>
            <td>${a.advertisingUrl}</td>
            <td>${a.advertisingContact}</td>
            <td>${a.advertisingPosition}</td>
            <td>${a.advertisingType}</td>
            <td><button id="btn" onclick="del(${a.advertisementId})">删除</button></td>>
        </tr>
    </c:forEach>
    </table>
<script>
    function del(id) {
        if(confirm("确定要删除")){
            $.ajax({
                url:'${pageContext.request.contextPath}/advertisement/del/'+id,
                type:'post',
                dataType:'text',
                success:function (data) {
                    alert(data);
                    if(data == "删除成功"){
                        alert("删除成功");
                        window.location.href="${pageContext.request.contextPath}/advertisement";
                    }else{
                        alert("操作失误，请重新操作");
                        window.location.href="${pageContext.request.contextPath}/advertisement";
                    }
                }
            })
        }else{
            window.location.href="${pageContext.request.contextPath}/advertisement";
        }
    }
</script>
</body>
</html>
