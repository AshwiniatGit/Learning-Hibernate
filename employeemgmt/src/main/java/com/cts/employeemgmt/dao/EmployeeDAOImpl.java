package com.cts.employeemgmt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.employeemgmt.bean.Employee;
import com.cts.employeemgmt.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static EmployeeDAOImpl employeeDAOImpl;
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	

	private EmployeeDAOImpl(){
	
	}
	
	public static EmployeeDAOImpl getInstance(){
		if(employeeDAOImpl==null){
			employeeDAOImpl =new EmployeeDAOImpl();
		}
		return employeeDAOImpl;
	}
	@Override
	public String addEmployee(Employee employee) {
		Session session= null;
		Transaction transaction = null;
		try{
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		
		transaction.begin();
		session.save(employee);//insert 
		transaction.commit();
		return "success";
		}
		catch(Exception ex){
			ex.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByNames(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		Session session= null;
		Transaction transaction = null;
		try{
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		
		transaction.begin();
		String query ="from Empl";
		session.save(employee);//insert 
		transaction.commit();
		return "success";
		}
		catch(Exception ex){
			ex.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
		finally
		{
			if(session!=null)
				session.close();
		}
		return null;
	}

}
