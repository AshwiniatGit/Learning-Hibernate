package com.cts.employeemgmt.main;

import com.cts.employeemgmt.bean.Address;
import com.cts.employeemgmt.bean.Employee;
import com.cts.employeemgmt.service.EmployeeService;
import com.cts.employeemgmt.service.EmployeeServiceImpl;

public class Main {

	public static void main(String args[]){
		System.out.println("Hello there");
		
	
	EmployeeService service = EmployeeServiceImpl.getInstance();
	Address address = new Address("Pune","Maharashtra"); 
		float sal = (float)1200.0;
	Employee employee = new Employee(6,"Aks","Sijhngh",sal,address);
		String result = service.addEmployee(employee);
	}
}
