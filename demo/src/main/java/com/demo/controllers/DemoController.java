package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping(value = "/hello/{no1}/{no2}")
	public String hello(@PathVariable int no1,@PathVariable int no2) {
		int sum=no1+no2;
		return "Sum :: "+Integer.toString(sum);
	}
}
