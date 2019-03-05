package com.cts.employeemgmt.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="Empl")
@Table(name="empl_table")
public class Employee {
		
	@Id 
	@Column(name="employeeid",nullable=false, length=40)
	private int employeeId;
	
	@Column(name="firstname",nullable=false, length=40)
	private String firstName;
	
	@Column(name="lastname",nullable=false, length=40)
	private String lastName;
	
	@Column(name="salary",nullable=false, length=40)
	private float salary;
	
	@ManyToOne
	@JoinColumn(name = "city")
	private Address address;
	
	
	public Employee() {
		super();
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}





	public Employee(Address address) {
		super();
		this.address = address;
	}


	public Employee(int employeeId, String firstName, String lastName, float salary, Address address) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
}
