package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User1;

@SpringBootApplication
public class BootJpaExample2Application {
	
	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(BootJpaExample2Application.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		//Dont use user as a entity oracle doesnt allow
//		User1 user=new User1();
//		user.setName("Komal vhanmane");
//		user.setCity("Solapur");
//		user.setStatus("Nothing1");
//		
//		User1 user1=userRepository.save(user);
		List<User1> lst=userRepository.findByName("Komal vhanmane");
		
		lst.forEach(e->System.out.println(e.getId()+" "+e.getName()));
		List<User1> lst1=userRepository.findByNameAndCity("Komal vhanmane", "Solapur");
		lst1.forEach(e->System.out.println(e.getCity()+" "+e.getName()));
		
	}

}
