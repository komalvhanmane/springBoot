package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.exception.ResourceNotFoundException;
import com.test.model.User1;
import com.test.repository.User1Repository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequestMapping("/api/v1/")
public class User1Controller {
	
	@Autowired
	private User1Repository userrepo;
//	@RequestMapping("/api/v1/")

	@GetMapping("/allusers")
	public List<User1> getAllUser(){
		System.out.print(userrepo.findAll());
		return userrepo.findAll();
	}
	
	//create 
	
	@PostMapping("/users")
	public  User1 createUser(@RequestBody User1 u) {
		System.out.println(u.getId()+"  "+u.getFname()+"  "+u.getEmail());
		return userrepo.save(u);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User1> getUser(@PathVariable int id) {
		User1 user=userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User doesnt exist with id : "+id));
		return ResponseEntity.ok(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<User1> update(@PathVariable int id,@RequestBody User1 userd){
		User1 user=userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User doesnt exist with id : "+id));
		user.setFname(userd.getFname());
		user.setLname(userd.getLname());
		user.setEmail(userd.getEmail());
		user.setPhNo(userd.getPhNo());
		
		User1 u=userrepo.save(user);
		
		return ResponseEntity.ok(u);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable int id){
		User1 user=userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User doesnt exist with id : "+id));
		userrepo.delete(user);
		Map<String,Boolean> mp=new HashMap<>();
		mp.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(mp);
	}
	
	
	
	
	
}
