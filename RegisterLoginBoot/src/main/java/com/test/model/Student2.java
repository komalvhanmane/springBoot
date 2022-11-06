package com.test.model;

import javax.persistence.*;

@Entity
public class Student2 {
	@Id
	private String CNo;
	private String Password;
	
	public Student2() {
		super();
	}
	public Student2(String cNo, String password) {
		super();
		CNo = cNo;
		Password = password;
	}
	public String getCNo() {
		return CNo;
	}
	public void setCNo(String cNo) {
		CNo = cNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
