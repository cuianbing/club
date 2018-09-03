package top.qudasai.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import top.qudasai.service.UserService;
import top.qudasai.vo.User;
import top.qudasai.vo.UserInfo;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	/**
	 * µÇÂ¼
	 * @param user
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/login.action")
	public ModelAndView itemList(User user, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		// ´ÓMysqlÖÐ²éÑ¯
		User login = userService.login(user);
		ModelAndView mav = new ModelAndView();
		if (null != login) {
			UserInfo userInfo = userService.findUserInfoById(login.getUserId());
			// Êý¾Ý
			session.setAttribute("user", login);
			mav.addObject("user", userInfo);
			mav.addObject("state", "true");// ×´Ì¬
			mav.setViewName("personal");
		} else {
			mav.addObject("state", "false");// ×´Ì¬
			mav.setViewName("login");// 404
		}
		return mav;
	}

	/**
	 * ÍË³ö
	 * @param user
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout.action")
	public ModelAndView logout(User user, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		User attribute = (User) session.getAttribute("user");
		System.out.println(attribute);
		session.setAttribute("user", null);
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", null);// ×´Ì¬
		mav.setViewName("index");
		return mav;
	}
}
