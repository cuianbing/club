<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>计算机软件协会</title>
	<link rel="icon" type="image/x-icon" href="img/title-ico.ico" />
    <!-- Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/style.css">
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- 图片滚动js -->
    <script src="js/jquery.slides.min.js"></script>
</head>
<style>
    .slidesjs-pagination li a {
		  display: block;
		  width: 13px;
		  height: 0;
		  padding-top: 13px;
		  background-image: url(img/pagination.png);
		  background-position: 0 0;
		  float: left;
		  overflow: hidden;
    }

</style>
<body>
<%
	String basepath = request.getContextPath();
%>
	<!-- 外部最大控件 -->
	<div class="container-fluid" style="height: 0px;">
		<!-- 导航栏目 -->
		<div class="row" id="banner">
			<nav class="navbar navbar-inverse navbar-static-top"
				role="navigation">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-2"></div>
						<!-- 导航栏 -->
						<div class="col-md-7">
							<div class="navbar-header">
								<a class="navbar-brand" href="<%=basepath%>/index.action">计算机软件协会</a>
								<button type="button" class="navbar-toggle collapsed"
									data-toggle="collapse" data-target="#navbar"
									aria-expanded="false" aria-controls="navbar"></button>
								<span class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</div>
							<!-- navbar-nav -->
							<div id="navbar" class="navbar-collapse collapse">
								<ul class="nav navbar-nav">
									<li><a href="<%=basepath%>/index.action">首页</a></li>
									<li><a href="<%=basepath%>/news.action">新闻动态</a></li>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown"> 社团概况 <b class="caret"></b>
									</a>
										<ul class="dropdown-menu">
											<li><a href="<%=basepath%>/intro.action">社团简介</a></li>
											<li><a href="<%=basepath%>/introduction.action">部门简介</a></li>
											<li class="divider"></li>
											<li><a href="<%=basepath%>/regulation.action">规章制度</a></li>
											<li class="divider"></li>
											<li><a href="<%=basepath%>/teacherinfo.action">指导老师</a></li>
										</ul>
									</li>
									<li><a href="<%=basepath%>/clubmien.action">社团风采</a></li>
									<c:if test="${sessionScope.user != null }">
		                                    <li id="vip"><a href="<%=basepath%>/personal.action">会员中心</a></li>
    								</c:if>
									
									<li><a href="<%=basepath%>/download.action">下载中心</a></li>
									<li><a href="http://www.qudasai.top/OJ/">OJ</a></li>
									<li><a href="http://www.qudasai.top/bbs/">论坛</a></li>

								</ul>
							</div>
						</div>
						<!-- 登录 -->
						<div class="col-md-3">
							<ul class="nav navbar-nav">
							<c:choose>
								<c:when test="${sessionScope.user != null}">
								    <li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">${user.userName} <b class="caret"></b>
										</a>
											<ul class="dropdown-menu">
												<li><a href="personal.jsp">個人中心</a></li>
												<li class="divider"></li>
												<li><a href="<%=basepath%>/logout.action">退出</a></li>
												</form>
											</ul>
								    </li>
								</c:when>
								<c:otherwise>
								     <li id="login"class="active"><a href="<%=basepath%>/login.action">登录</a></li>
								</c:otherwise>
							</c:choose>
							</ul>
						</div>
					</div>
				</div>
			</nav>
		</div>