package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//we can either use RestController or Controller and ResponseBody

// RestController is used for making restful web services with the help of the @RestController annotation

//What is the meaning of RESTful web services?
//RESTful Web Services are basically REST Architecture based Web Services. In REST Architecture everything is a resource. RESTful web services are light weight, highly scalable and maintainable and are very commonly used to create APIs for web-based applications.

//API is the Programming Interface which are basically act as intermidiary in two application to talk each other

//what is restFul API
//A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data
// That data can be used to GET, PUT, POST and DELETE data types, which refers to the reading, updating, creating and deleting of operations concerning resources.


@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handleTest() {
		return "Hello";
	}
}
