package com.test;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.controller.NumberController;
import com.test.model.Number2;

@SpringBootApplication
public class SpringBootAddition1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAddition1Application.class, args);
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Number2 n=new Number2(num1,num2);
		NumberController nc=new NumberController();
		nc.add(n);
	}

}
