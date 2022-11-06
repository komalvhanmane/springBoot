package com.test.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dao.StudentRepository;
import com.test.model.Student2;



//restController
//@ResponseBody annotations are used to convert Body of HTTP request and response to Java class object.
//create RESTful web services using Spring MVC.
//the controller class is responsible for processing incoming REST API requests, preparing a model, and returning the view to be rendered as a response. 
@Controller
public class StudentController {
	@Autowired
	StudentRepository str;
	
	@RequestMapping("/")
	public String home() {
		return "register";
	}
	
	@RequestMapping("/register1")
	public String register1(Student2 s,HttpSession session) {
		str.save(s);
		return "login";
	}
	
	@RequestMapping("/login1")
	public String login1(Student2 s) {
		Optional<Student2> itr=str.findById(s.getCNo());
		if(itr.isEmpty()) {
			return "register";
			//if account not exist
		}
		else if(itr.get().getPassword().equals(s.getPassword())){
			//if correct info
			return "dashboard";
		}
		//wrong info
		return "login";
	}
	
}
