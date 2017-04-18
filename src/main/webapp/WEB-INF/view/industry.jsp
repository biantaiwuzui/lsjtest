<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script src="${pageContext.request.contextPath}/assets/javascript/jquery-1.11.1.js"></script>
</head>
<body>
<div style="width: 100%">
<div id="right" style="height: 400px;max-height: 400px; width: 300px;overflow-y: auto;float: left">
    <ul>
        <c:forEach items="${industryList}" var="i">
            <li><button  class="right" id="${i.industryId}">${i.industryName}</button></li>
        </c:forEach>
    </ul>

</div>
<div id="left" style="float: left">
    <ul id="leftbody">
        <c:forEach items="${industryList.get(0).positionNames}" var="p">
            <li>${p.pname}</li>
        </c:forEach>
    </ul>
</div>
</div>
<script>
    $(".right").on("click",function () {
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/positionName/"+this.id,
            success: function(data){
                var str="";
                $.each(data,function(i,v){
                    str+="<li id="+v.positionNameId+">";
                    str+="&nbsp;&nbsp;"+v.pname+"</li>";

                });
                $("#leftbody").html(str);

            },
            dataType: "json"
        });
    });
</script>
<%--<div id="body"><c:forEach items="${industryList}" var="i">
    <p><span id="${i.industryId}">${i.industryName}</span>      --->
        <c:forEach items="${i.positionNames}" var="p"><span id="${p.positionNameId}">【${p.pname}】</span></c:forEach>
        </p>
</c:forEach></div>--%>
<%--<script type="text/javascript" charset="UTF-8">
    $(document).ready(function(){
       $.ajax({
           type: "post",
           url: "${pageContext.request.contextPath}/type/getType",
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
</script>--%>
</body>
</html>
