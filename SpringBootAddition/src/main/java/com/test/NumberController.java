package com.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Number;

@RestController
public class NumberController {
	
	@PostMapping("/numbercontroller")
	public int numbercontroller(@RequestBody Number n) {
		int sum=n.getNum1()+n.getNum2();
		return sum;
	}
}
