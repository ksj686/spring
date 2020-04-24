package com.spring.myapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("1")
	public ModelAndView main() {
		ModelAndView test = new ModelAndView(); // 객채만들기
		test.setViewName("/index");
		return test; 
	}
}
