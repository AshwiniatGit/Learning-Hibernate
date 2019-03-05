package com.cts.employeemgmt.service;

import java.util.List;

import com.cts.employeemgmt.bean.Employee;
import com.cts.employeemgmt.dao.EmployeeDAO;
import com.cts.employeemgmt.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeServiceImpl employeeServiceImpl;
	
	private  EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static EmployeeServiceImpl getInstance(){
		if(employeeServiceImpl==null)
		{
			employeeServiceImpl = new EmployeeServiceImpl();
		}
		return employeeServiceImpl;
	}
	EmployeeDAO dao =  EmployeeDAOImpl.getInstance();
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	@Override
	public String updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	@Override
	public List<Employee> getEmployeesByNames(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployeesByNames(name);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

}
