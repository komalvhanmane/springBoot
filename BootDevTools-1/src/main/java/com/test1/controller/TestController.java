package com.test1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String test(HttpServletRequest request) {
		String name=request.getParameter("name");
		HttpSession session=request.getSession();
		System.out.println(name+" "+"Name ");
		session.setAttribute("name", name);
		return "index";
	}
}
