<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>捕获全局异常</title>
</head>
<body>
	<h1 style="color: red">发生错误：</h1>
	<p> 访问的url:http://127.0.0.1:8080${url}</p>
	<p> 方法类型:${method}</p>
	<p> 错误信息：${error} </p>
</body>
</html>