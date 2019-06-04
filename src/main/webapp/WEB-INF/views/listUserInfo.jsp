<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/js/common/layui/css/layui.css"  media="all">
    <script type="application/javascript" src="<%=request.getContextPath()%>/static/js/common/layui/layui.all.js"></script>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="layui-table" lay-skin="line">
    <tr>
        <td>uId</td>
        <td>uName</td>
        <td>name</td>
    </tr>
    <c:forEach items="${userBeans}" var="s" varStatus="st">
        <tr>
            <td>${s.uId}</td>
            <td>${s.uName}</td>
            <td>${s.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
