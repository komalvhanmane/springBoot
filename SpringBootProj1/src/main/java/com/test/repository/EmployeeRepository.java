package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
