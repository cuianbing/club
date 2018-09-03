package top.qudasai.controller;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import top.qudasai.common.Status;
import top.qudasai.service.NewsService;
import top.qudasai.vo.ClubNews;

@Controller
public class NewsController {
    
	@Resource
	private NewsService newsServices;
	
	@RequestMapping(value = "/index.action")
	public ModelAndView findNews() {
		List<ClubNews> newsTop10 = newsServices.findNewsTop(10);
		System.out.println(newsTop10);
		Random rand = new Random();
		ModelAndView mav = new ModelAndView();
		mav.addObject("newsList", newsTop10);
		mav.addObject("tdClass", Status.TDCLASS[rand.nextInt(3)]);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value = "/news.action")
	public ModelAndView news(HttpServletRequest request,HttpServletResponse response) {
		List<ClubNews> newsTop15 = newsServices.findNewsTop(15);
		System.out.println(newsTop15);
		Random rand = new Random();
		ModelAndView mav = new ModelAndView();
		mav.addObject("newsList", newsTop15);
		mav.addObject("tdClass", Status.TDCLASS[rand.nextInt(3)]);
		mav.setViewName("news");
		return mav;
	}
}
