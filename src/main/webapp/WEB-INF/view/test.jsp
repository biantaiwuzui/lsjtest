<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="${pageContext.request.contextPath}/assets/javascript/jquery-1.11.1.js"></script>
</head>
<body>
<c:forEach items="${enterpriseList }" var="e">
    <p>${e.enterpriseTypeId}-- ${e.enterpriseTypeName}</p>
</c:forEach>
<div id="body"></div>
<script type="text/javascript" charset="UTF-8">
    $(document).ready(function(){
       $.ajax({
           type: "post",
           url: "${pageContext.request.contextPath}/enterpriseType/getType",
           success: function(data){
               console.log(data);
               var str="";
               $.each(data,function(i,v){
                   str+="<p>类型编号:"+v.enterpriseTypeId;
                   str+="&nbsp;&nbsp;类型名字: "+v.enterpriseTypeName+"</p>";

               });
               $("#body").html(str);

           },
           dataType: "json"
       });
    });
</script>
</body>
</html>
