<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/28
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body>

<form action="${pageContext.request.contextPath}/schoolType" id="frm" method="post">
    <input type="text" id="name" name="name" />
    <button id="tj">添加</button>
</form>
<table>
    <tr><th>id</th><th>name</th></tr>
    <tbody id="tbody"></tbody>
</table>

<form:form action="${pageContext.request.contextPath}/schoolType/edit" method="PUT" modelAttribute="schoolType">
   id: <input type="text" id="sid" name="schoolTypeId">
   name: <input type="text" id="sname" name="schoolTypeName">
    <button id="edit" type="submit">edit</button>
</form:form>

<script type="text/javascript">
    $(document).ready(function () {
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/schoolType/findAll",
            dataType: "json",
            success: function(data){
                var str="";
                $.each(data,function(i,v){
                    str+="<tr>" ;
                    str+="<td>"+v.schoolTypeId+"</td>";
                    str+="<td>"+v.schoolTypeName+"</td>";
                    str+="</tr>";

                });
                $("#tbody").html(str);

            }
        });
    });
    $("#tj").on("click",function () {
        $("#frm").attr("action", $("#frm").attr("action")+"/"+$("#name").val());
        $("#frm").submit();
    });


</script>


</body>
</html>
