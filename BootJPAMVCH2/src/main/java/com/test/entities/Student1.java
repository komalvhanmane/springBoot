package com.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student1 {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String status;
	public Student1(int id, String fname, String lname, String status) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Student1() {
		
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", fname=" + fname + ", lname=" + lname + ", status=" + status + "]";
	}
	
	
}
