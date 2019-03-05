package com.cts.employeemgmt.dao;

import java.util.List;

import com.cts.employeemgmt.bean.Employee;

public interface EmployeeDAO {
	public String addEmployee(Employee employee);
	public String updateEmployee(int id, Employee employee);
	public String deleteEmployee(int id);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeesByNames(String name);
	public List<Employee> getEmployees();
 }

