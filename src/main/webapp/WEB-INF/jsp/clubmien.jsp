<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/commonpage/header.jsp"%>

<!-- 主体内容 -->
  		<div class="row">
  			<!-- 左侧留白 -->
  			<div class="col-md-2"></div>
  			<!-- main  -->
  			<div class="col-md-8" style="background-color:#e7e8ee">
  		        
  			</div>
  			<!-- 右侧留白 -->
  			<div class="col-md-2"></div>
  		</div>
  		
  		<footer class="row" id="bottom">
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
 	    </footer>
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
	<!-- 图片滚动 -->
	<script>
		$(function() {
			 document.title = 'CSA - 社团风采';
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