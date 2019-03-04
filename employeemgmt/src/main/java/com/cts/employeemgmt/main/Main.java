package com.cts.employeemgmt.main;

import com.cts.employeemgmt.bean.Employee;
import com.cts.employeemgmt.service.EmployeeService;
import com.cts.employeemgmt.service.EmployeeServiceImpl;

public class Main {

	public static void main(String args[]){
		System.out.println("Hello there");
		float salary = (float) 12000.0;
		Employee employee = new Employee(1, "Ashwini","Singh", salary);
		EmployeeService service = EmployeeServiceImpl.getInstance();
		String result  = service.addEmployee(employee);
		if("success".equals(result))
			System.out.println("Added");
		else
			System.out.print("Not Addeed");
	}
}
