<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/commonpage/header.jsp"%>
		<!-- 主体内容 -->
		<div class="row">
			<!-- 左侧留白 -->
			<div class="col-md-2"></div>
			<!-- 内容栏目  居中 -->
			<div class="col-md-8" style="background-color: #e7e8ee">
				<!-- 图片展示栏 -->
				<div class="row" id="photopresentation" style="width: 100%;">
					<div id="slides">
						<img src="img/example-slide-1.jpg"> 
						<img src="img/example-slide-2.jpg"> 
						<img src="img/example-slide-3.jpg"> 
						<img src="img/example-slide-4.jpg"> 
						<img src="img/timg.jpg">
					</div>
				</div>
				<!-- 二级标题栏 -->
				<div class="row" id="ico-1" style="width: 100%;">
					<div class="col-md-4 col-sm-4  visible-md-block visible-lg-block"
						align="left">
						<img src="img/zxhd.png">
					</div>
					<div class="col-md-4 col-sm-2"></div>
					<div class="col-md-4 col-sm-2 visible-md-block visible-lg-block"
						align="right">
						<img src="img/zxtz.png">
					</div>
				</div>
				<!--  主要活动-->
				<div class="row" id="">
					<div class="col-md-8" style="margin-top: 10px">
						<div class="row visible-md-block visible-lg-block" align="center">
							<div class="col-md-4">
								<img src="img/activity/activity01.png" style="width: 200px; height: 200px">
							</div>
							<div class="col-md-4">
								<img src="img/activity/activity02.png" style="width: 150; height: 200px">
							</div>
							<div class="col-md-4">
								<img src="img/activity/activity03.png" style="width: 150; height: 200px">
							</div>
						</div>

						<div class="row visible-md-block visible-lg-block"
							style="margin-top: 10px" align="center">
							<div class="col-md-4 ">
								<img src="img/activity/activity04.png" style="width: 200px; height: 200px">
							</div>
							<div class="col-md-4">
								<img src="img/activity/activity05.png" style="width: 150; height: 200px">
							</div>
							<div class="col-md-4">
								<img src="img/activity/activity06.png" style="width: 150; height: 200px">
							</div>
						</div>
						<!-- 手机端展示 -->
						<div class="row visible-sm-block visible-xs-block" align="center">
							<div class="col-xs-6">
								<img src="img/activity/activity01.png" style="width: 150px; height: 150px">
							</div>
							<div class="col-xs-6">
								<img src="img/activity/activity02.png" style="width: 150px; height: 150px">
							</div>
							<div style="margin-top: 3px">·</div>
							<div class="col-xs-6">
								<img src="img/activity/activity03.png" style="width: 150px; height: 150px">
							</div>
							<div class="col-xs-6">
								<img src="img/activity/activity04.png" style="width: 150px; height: 150px">
							</div>
						</div>
					</div>
					<!-- 公告栏 -->
					<div class="col-md-4" align="center">
						<table class="table">
							<thead class="text-allcenter">
								<tr>
									<th>文件名</th>
									<th>发布日期</th>
								</tr>
							</thead>
							<tbody>
							    <c:forEach  items="${newsList }" var="news">
									<tr class="${tdClass}">
										<td class="filename-td">
										    <a href="${news.newsUrl}"  title=" ${news.newsTitle}"
										    style="text-decoration:none;color: #000000">
										        ${news.newsTitle}
										    </a>
										</td>
										<td class="date-td">
										<fmt:formatDate value="${news.newsDate}" pattern="yyyy-MM-dd"/>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>
			<!-- 右侧留白 -->
			<div class="col-md-2"></div>
		</div>

		<div class="row" id="bottom">
			<div class="col-md-4" style="height: 100px">
				<img src="img/wx.jpg" style="height: 80px; width: 80px;"
					class="img-allcenter">
			</div>
			<div class="col-md-4 text-allcenter">
				<br /> <span> 鲁ICP备17056080号-1<br />
					山东交通学院计算机软件协会&copy;版权所有<br /> 
					地址：山东省济南市长清区海棠路5001号
				</span>

			</div>
			<div class="col-md-4" style="height: 100px">
				<img src="img/wx.jpg" style="height: 80px; width: 80px;"
					class="img-allcenter">
			</div>
		</div>
		
	</div>

	<script>
		$(window).scroll(function() {
			//小屏幕下的导航条折叠
			if ($(window).width() < 768) {
				//点击导航链接之后，把导航选项折叠起来
				$("#navbar a").click(function() {
					$("#navbar").collapse('hide');
				});
				//滚动屏幕时，把导航选项折叠起来
				$(window).scroll(function() {
					$("#navbar").collapse('hide');
				});
			}
		});
		
	</script>
	<!-- 图片滚动 -->
	<script>
		$(function() {
			document.title = '计算机软件协会 - 官网';
			$('#slides').slidesjs({
				width : 900,
				height : 400,
				play : {
					active : true,
					auto : true,
					interval : 4000,
					swap : true
				}
			});
		});
	</script>
	<script>
	
	</script>
</body>
</html>