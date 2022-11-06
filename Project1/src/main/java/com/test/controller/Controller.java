package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Employee;

@RestController
public class Controller {
	
	@GetMapping(value="/hello")
	public Employee hello(@RequestParam int id) {
		return new Employee(id,"Komal",19,00);
	}
	
}
