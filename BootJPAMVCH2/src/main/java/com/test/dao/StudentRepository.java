package com.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.entities.Student1;

@Repository
public interface StudentRepository extends CrudRepository<Student1,Integer>{

}
