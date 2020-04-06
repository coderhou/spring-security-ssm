<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body>
<c:if test="${not empty param.error}">
    <font color="red" size="14px">用户名或密码错误</font>
</c:if>
<form action="${pageContext.request.contextPath}/login" method="post" id="loginForm">
    用户名 <input type="text" name="username"><br>
    密码 <input type="text" name="password"><br>
    验证码 <input type="text" name="imageCode"><br>
    记住我 <input type="checkbox" name="remember-me" value="true"><br>
    <input id="btn" type="button" value="提交">
</form>
</body>

<script type="text/javascript">
    $(function () {
        $('#btn').click(function () {
            $.post('${pageContext.request.contextPath}/login', $('#loginForm').serialize(), function (data) {
                if (data.success == true) {
                    window.location.href = '${pageContext.request.contextPath}/user/list';
                } else {
                    alert('登录失败:'+data.errorMsg);
                }
            }, "json");
        });
    });

</script>
</html>
