package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStsApplication.class, args);
	}

}
//It uses convention over configuration software design paradigm that means it decreases the effort of the developer.
//annotations are just used to supply additional information
//Spring IoC Container is the core of Spring Framework.
//It creates the objects, configures and assembles their dependencies, manages their entire life cycle. 
//The Container uses Dependency Injection(DI) to manage the components that make up the application
//the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans