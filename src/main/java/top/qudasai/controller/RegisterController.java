package top.qudasai.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import top.qudasai.service.CollageAndClass;
import top.qudasai.service.InboxService;
import top.qudasai.service.UserService;
import top.qudasai.vo.Clbum;
import top.qudasai.vo.Collage;
import top.qudasai.vo.RegisterVo;


/**
 * 提供用户注册
 * @author cuian
 *
 */
@Controller
public class RegisterController {
    
	@Resource
	private UserService userService;
	
	@Autowired
	private CollageAndClass collageAndClass;
	
	@Resource
	private InboxService inboxService;
	
	@RequestMapping(value = "/registerin.action")
	public ModelAndView registerin(HttpServletRequest request,HttpServletResponse response) {
		List<Collage> findAllCollage = collageAndClass.findAllCollage();
		List<String> lisetInbox = inboxService.findAllInbox();//获得所有邀请码
		System.out.println(findAllCollage);
		ModelAndView mov = new ModelAndView();
		mov.addObject("collageList",findAllCollage);
		mov.addObject("lisetInbox",lisetInbox);
		mov.setViewName("register");
		return mov;
	}
	
	/**
	 * 获得学院下的班级
	 * @param uid
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/clbum.action")
	public void clbum(@RequestParam("uid") String uid,HttpServletRequest request,HttpServletResponse response) {
		int parseInt = Integer.parseInt(uid);
		List<Clbum> club = collageAndClass.findClbumByCollageId(parseInt);
		System.out.println(club);
		StringBuffer sb=new StringBuffer();
        for(int i=0;i<club.size();i++){
            sb.append(club.get(i).getClbumId()).append("=").append(club.get(i).getClbumName());
            if(i!=club.size()-1){
                sb.append(",");
            }
        }
		
		try {
			response.getWriter().print(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 *  真正的注册
	 * @param rester
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/register.action")
	public ModelAndView register(RegisterVo rester,HttpServletRequest request,HttpServletResponse response) {
		System.out.println(rester);
		int registerUser = userService.registerUser(rester);
		ModelAndView mov = new ModelAndView();
		if(registerUser > 0) {
			mov.addObject("uservo",rester);
			mov.setViewName("success");
		}else {
			mov.setViewName("error");
		}
		return mov;
	}
}
