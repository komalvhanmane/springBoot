package com.test.Entity;

public class Employee {
	private int empid;
	private String empName;
	private int age;
	private double salary;
	
	public Employee(int empid, String empName, int age, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
