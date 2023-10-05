package com.jsp.employee.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	// To Save an Employee
	
	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
	
	
//====================================================================================================================================
	
	// To Delete an employee by id
	
	public boolean deleteEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return true;
			
	}
	
	
//==================================================================================================================================
	
	// To Update the name of employee
	
	public boolean updateNameById(int id, String new_name) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setName(new_name);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}

//=================================================================================================================================
	
	
	// To Update the email of employee
	
	public boolean updateEmailById(int id, String new_email) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setEmail(new_email);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}
	
//====================================================================================================================================
	
	// To Update the contact number of employee
	
	public boolean updateCnoById(int id, long new_cno) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setCno(new_cno);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}
	
	
//=====================================================================================================================================
	
	// To Get the details of employee by Id
	
	public Employee getEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
		
	}
	
	
//====================================================================================================================================
	
	
	// To Get all the employees details
	
	public List<Employee> getAllEmployees() {
		String sql = "Select e from Employee e";
		Query query = entityManager.createQuery(sql);
		
		List<Employee> list = query.getResultList();
		
		return list;
		
	}
	
	
//===================================================================================================================================
	

}
