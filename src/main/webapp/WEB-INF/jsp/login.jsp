<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport"
		content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<link href="css/login.css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="icon" type="image/x-icon" href="img/title-ico.ico" />
	<title>CSA - 登录</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login.action"
		method="post">
		<div class="dowebok">
			<div class="logo"></div>
			<div class="form-item">
				<input id="username" name="userName" value="${userName}" type="text"
					autocomplete="off" placeholder="账号">
				<p class="tip">账号或密码不正确！</p>
			</div>
			<div class="form-item">
				<input id="password" name="userPassword" value="${userPassword}"
					type="password" autocomplete="off" placeholder="登录密码">
				<p class="tip">账号或密码不正确！</p>
			</div>
			<div class="form-item">
				<button id="submit">登 录</button>
			</div>
			<div class="reg-bar">
				<a class="reg" href="${pageContext.request.contextPath }/registerin.action">立即注册</a> <a class="forget"
					href="javascript:alert('联系管理员：China_cab@163.com');">忘记密码</a>
			</div>
		</div>
	</form>
	<a style="text-decoration: none;" href="index.jsp">首页</a>
</body>

<script>
	$(function() {
		var status = "${state}";
		if(!status){
			$('.tip').show();
		}
	})
</script>
</html>