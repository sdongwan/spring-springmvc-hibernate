<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
<%--<c:if test="${students==null||students.size()==0}">暂无学生信息</c:if>--%>

<table>
    <tr>
        <td>学生姓名</td>
        <td>学生专业</td>
        <td>学生性别</td>
    </tr>
    <c:forTokens items="a,b,c" delims="," var="item">

   ${item};
    </c:forTokens>
</table>
</body>
</html>
