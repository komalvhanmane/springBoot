package com.springboot.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@Controller: The @Controller is a class-level annotation.
// It is a specialization of @Component. It marks a class as a web request handler. 
//It is often used to serve web pages.
//By default, it returns a string that indicates which route to redirect. 
//It is mostly used with @RequestMapping annotation.


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("this is Home Page");
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		session.setAttribute("name", name);
		return "home";
	}
	
	
//	@RequestMapping("/contact")
//	public String contact() {
//		System.out.println("this is Contact Page");
//		return "contact";
//	}
	
	@RequestMapping("/addition")
	public String addition(String no1,String no2,HttpSession session) {
		int sum=Integer.parseInt(no1)+Integer.parseInt(no2);
		session.setAttribute("sum", sum);
		System.out.println("Sum :: "+sum);
		return "index";
	}
	
}
