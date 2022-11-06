package com.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dao.StudentRepository;
import com.test.entities.Student1;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository stp;
	
	@RequestMapping("/")
	public String student() {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student1 s,HttpSession session) {
		System.out.println("Student name :: "+s.getFname()+"Student last Name :: "+s.getLname());
		stp.save(s);
		
		session.setAttribute("obj", s);
		return "StudentInfo";
	}
}
