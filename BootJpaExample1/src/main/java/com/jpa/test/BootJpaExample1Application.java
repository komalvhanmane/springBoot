package com.jpa.test;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.*;
import com.jpa.test.entities.User;


@SpringBootApplication
public class BootJpaExample1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootJpaExample1Application.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		User user=new User();
		user.setName("asadfsd Amasidha Vhanmane");
		user.setCity("Solapur");
		user.setStatus("I am Boy");
		
		//User user1 =userRepository.save(user);
		//if we want to save only 1 
		User user1=new User();
		user1.setName("hjjhgj Amasidha Vhanmane");
		user1.setCity("Solapur");
		user1.setStatus("I am Boy");
		
		ArrayList<User> arr=new ArrayList<>();
		arr.add(user);
		arr.add(user1);
		//if we want to save multiple
	//	ArrayList<User> arr1=(ArrayList<User>) userRepository.saveAll(arr);
	//	System.out.println(arr1.get(0).getName()+" "+arr1.get(1).getName());
		
		//Now for Update
		Optional<User> optional=userRepository.findById(9);
		User u=optional.get();
		u.setCity("Pune");
		//User user2 =userRepository.save(u);
		//System.out.println(user2.getCity());
		
		//Now if we want to retrive all data 
		Iterable<User> itr=userRepository.findAll();
		itr.forEach(User->{
			System.out.println(User.getId());
		});
		
		//delete 
		userRepository.deleteById(10);
		System.out.println("Deleted");
	}

}
