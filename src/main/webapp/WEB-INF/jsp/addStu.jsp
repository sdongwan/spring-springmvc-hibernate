<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
<form:form action="/ssh/listStu" method="post" commandName="student">
    <fieldset>
        <label for="name">请输入学生姓名</label>
        <form:input path="name"/>
        <label for="major"></map>">请输入学生专业</label>
        <form:input path="major"/>
        <label for="gender">请输入学生性别</label>
        <form:input path="gender"/>
        <input type="reset" value="重置"/>
        <input type="submit" value="添加"/>
    </fieldset>

</form:form>
</body>
</html>
