package com.cts.employeemgmt.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Id 
	@Column(name="city",nullable=false, length=40)
	String city;
	@Column(name="state", nullable=false, length=50)
	String state;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
	private List<Employee> employees = new ArrayList<>();
	
	public Address(String city, String state) {
		super();
		
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	public Address() {
		super();
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	  public List<Employee> getEmployees() {
	      return employees;
	   }

	   public void setEmployees(List<Employee> employees) {
	      this.employees = employees;
	   }
	   
}
