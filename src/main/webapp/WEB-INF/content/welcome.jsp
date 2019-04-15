<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>helloworld</title>
</head>
<body>
<!-- 页面可以访问Controller传递出来的message -->
 <h3>热烈欢迎[${requestScope.user.username}]登录！！！</h3>
</body>
</html>