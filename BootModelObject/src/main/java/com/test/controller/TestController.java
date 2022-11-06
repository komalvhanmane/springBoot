package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.entities.Student;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public ModelAndView accept(Student s) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",s);
//		mv.addObject("fname",s.getFname());
//		mv.addObject("lname",s.getLname());
//		mv.addObject("status",s.getStatus());
		
		mv.setViewName("home");
		return mv;
		
	}
}
