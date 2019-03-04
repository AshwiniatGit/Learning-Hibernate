package com.cts.employeemgmt.dao;

import java.util.List;

import com.cts.employeemgmt.bean.Employee;

public interface EmployeeDAO {
	public String addEmployee(Employee employee);
	public String updateEmployee(String id, Employee employee);
	public String deleteEmployee(String id);
	public Employee getEmployee(String id);
	public List<Employee> getEmployeesByNames(String name);
	public List<Employee> getEmployees();
 }

