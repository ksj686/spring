package com.spring.myapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.myapp.Service.MemberService;
import com.spring.myapp.vo.MemberVO;


@Controller
public class TestController {
	
	private MemberService service;
	
	public void setService(MemberService service) {
		this.service = service;
	}
	@RequestMapping("1")
	public ModelAndView main() {
		ModelAndView test = new ModelAndView(); // 객채만들기
		test.setViewName("/index");
		return test; 
	}
	
	@RequestMapping("/dbTest.do")
	public ModelAndView view() throws Exception {
		ModelAndView mav = new ModelAndView();
		MemberVO ipList = service.selectMember();
		System.out.println(ipList);
		mav.setViewName("/main");
		
		return mav;
    }
}
