package top.qudasai.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 给静态资源转发
 * @author cuian
 *
 */
@Controller
public class RepeaterController {
	
	@RequestMapping(value = "/clubmien.action")
	public ModelAndView clubmien(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity",null);
		mov.setViewName("clubmien");
		return mov;
	}
	
	@RequestMapping(value = "/download.action")
	public ModelAndView download(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity",null);
		mov.setViewName("download");
		return mov;
	}
	
	@RequestMapping(value = "/intro.action")
	public ModelAndView intro(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity",null);
		mov.setViewName("intro");
		return mov;
	}
	
	@RequestMapping(value = "/introduction.action")
	public ModelAndView introduction(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity",null);
		mov.setViewName("introduction");
		return mov;
	}
	
	
	
	
	
	@RequestMapping(value = "/personal.action")
	public ModelAndView personal(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity",null);
		mov.setViewName("personal");
		return mov;
	}

	@RequestMapping(value = "/regulation.action")
	public ModelAndView regulation(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity", null);
		mov.setViewName("regulation");
		return mov;
	}
	
	@RequestMapping(value = "/teacherinfo.action")
	public ModelAndView teacherinfo(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		mov.addObject("varsity",null);
		mov.setViewName("teacherinfo");
		return mov;
	}
}
