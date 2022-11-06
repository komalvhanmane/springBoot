package com.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Number2;

@RestController
public class NumberController {
	@PostMapping("/")
	public int add(Number2 n) {
		int add=n.getNum1()+n.getNum2();
		return add;
	}
}
