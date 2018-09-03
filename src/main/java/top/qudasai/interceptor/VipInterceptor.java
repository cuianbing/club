package top.qudasai.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class VipInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String requestURI = request.getRequestURI();
		System.out.println("µÇÂ¼À¹½ØÆ÷-------" + requestURI);
		if(requestURI.contains("personal")) {
			Object attribute = request.getSession().getAttribute("user");
			if(attribute == null) {
				response.sendRedirect(request.getContextPath()+"/index.action");
				return false;
			}
		}
		return true;
	}
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}


}
