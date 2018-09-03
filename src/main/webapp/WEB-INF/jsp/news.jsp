<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/commonpage/header.jsp"%>
  		<!-- 主题内容 -->
  		<div class="row">
  			<!-- 左侧留白 -->
  			<div class="col-md-2"></div>
  			<!-- 内容栏目  居中 -->
  			<div class="col-md-8" style="background-color:#e7e8ee">
  				<!-- 图片展示栏 -->
				<div class="row" id="photopresentation" style="width: 100%;">
				    <div id="slides">
					  <img src="img/news/backgroundImg/example-slide-1.jpg">
					  <img src="img/news/backgroundImg/example-slide-2.jpg">
					  <img src="img/news/backgroundImg/example-slide-3.jpg">
					  <img src="img/news/backgroundImg/example-slide-4.jpg">
					  <img src="img/news/backgroundImg/timg.jpg">
					</div>
				</div>
				
				<!--  锥心活动-->
				<div class="row" id="">
				    <!-- 左侧链接 -->
					<div class="col-md-3" align="center">
					    <table class="table" align="center">
				         <thead class="text-allcenter">
							    <tr>
							        <th>&nbsp;</th>
								</tr>
						    </thead>
						    <tbody style="text-align: center">
						        <tr class="success"><td>社团通知</td></tr>
						        <tr class="warning"><td>比赛通知</td></tr>
						        <tr class="danger"> <td>学院新闻</td></tr>
						        <tr class="active"> <td>学校通知</td></tr>
					        </tbody>
						</table>
					</div>
					<!-- 右侧具体信息栏 -->
					<div class="col-md-9" align="center">
						<table class="table">
						    <thead class="text-allcenter">
							    <tr>
							        <th style="text-align: center">文件名</th>
							        <th style="text-align: center">发布日期</th>
								</tr>
						    </thead>
						  <tbody style="text-align: center">
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
				<img src="img/wx-java.jpg" style="height: 80px;width: 80px;" class="img-allcenter">
			</div>
			<div class="col-md-4 text-allcenter">
				<br />
				<span>
					鲁ICP备17056080号-1<br />
					山东交通学院计算机软件协会&copy;版权所有<br />
					地址：山东省济南市长清区海棠路5001号
				</span>
				
			</div> 				
			<div class="col-md-4" style="height: 100px">
				<img src="img/wx-java.jpg" style="height: 80px;width: 80px;" class="img-allcenter">
			</div>
 	    </div>
	</div>

    
    
  <script>
		$(window).scroll(function () {
	  //小屏幕下的导航条折叠
	  if ($(window).width() < 768) {
		//点击导航链接之后，把导航选项折叠起来
		$("#navbar a").click(function () {
		  $("#navbar").collapse('hide');
		});
		//滚动屏幕时，把导航选项折叠起来
		$(window).scroll(function () {
		  $("#navbar").collapse('hide');
		});
	  }
	});
 </script>
 <!-- 图片轮播 -->
  <script>
    $(function() {
    	document.title = 'CSA - 新闻';
      $('#slides').slidesjs({
        width: 900,
        height: 400,
        play: {
          active: true,
          auto: true,
          interval: 4000,
          swap: true
        }
      });
    });
  </script>
  </body>
</html>