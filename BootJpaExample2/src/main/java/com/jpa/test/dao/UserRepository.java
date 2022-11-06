package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.entities.User1;

//@Repository: It is a class-level annotation. 
//The repository is a DAOs (Data Access Object) that access the database directly. 
//The repository does all the operations related to the database.

@Repository
public interface UserRepository extends CrudRepository<User1,Integer>{
	//by extending CRUDRepository all methods are accesible 
	//now custom method
	
	public List<User1> findByName(String name);
	public List<User1> findByNameAndCity(String name,String city);
	
}
