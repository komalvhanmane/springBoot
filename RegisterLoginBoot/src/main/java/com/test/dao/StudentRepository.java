package com.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Student2;

@Repository
public interface StudentRepository extends CrudRepository<Student2,String>{

}
