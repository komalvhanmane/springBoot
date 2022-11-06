package com.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/")
	//request param is used to just map means whatever value will be given from client for name it transfer  this name to myname attribute
	public ModelAndView home(@RequestParam ("name")String Myname,HttpSession session) {
		
		//session.setAttribute("name", Myname);
		//instead of using http session we can use modelandview
		ModelAndView vm=new ModelAndView();
		vm.addObject("name",Myname);//its like a setAttribute
		vm.setViewName("home");//setView it call home page basically
		return vm;
	}
}
