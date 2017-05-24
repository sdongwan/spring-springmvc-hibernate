<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
<form:form commandName="user" action="/ssh/addStu" method="post">
    <fieldset>
        <label for="username">请输入用户名</label>
        <form:input path="username" tabindex="1"/>
        <label for="username">请输入用密码</label>
        <form:input path="password" tabindex="2"/>
        <input type="reset" value="重置"/>
        <input type="submit" value="登陆"/>
    </fieldset>

</form:form>
</body>
</html>
