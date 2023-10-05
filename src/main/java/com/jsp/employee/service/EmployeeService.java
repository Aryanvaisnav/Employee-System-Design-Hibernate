package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

//===================================================================================================================

	public Employee saveEmployee(Employee employee) {
		if(employee != null) {
			return employeeDao.saveEmployee(employee);
		}
		else {
			return null;
		}
		
	}

//====================================================================================================================

	public boolean deleteEmployeeById(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		if(employee != null) {
			return employeeDao.deleteEmployeeById(id);
		}
		else {
			return false;
		}
		
	}

//=====================================================================================================================
	
	public boolean updateNameById(int id, String new_name) {
		Employee employee = employeeDao.getEmployeeById(id);
		if(employee != null) {
			return employeeDao.updateNameById(id, new_name);
		}
		else {
			return false;
		}
	}
	
//=====================================================================================================================

	public boolean updateEmailById(int id, String new_email) {
		Employee employee = employeeDao.getEmployeeById(id);
		if(employee != null) {
			return employeeDao.updateEmailById(id, new_email);
		}
		else {
			return false;
		}
		
	}
	
//===================================================================================================================
	
	public boolean updateCnoById(int id, long new_cno) {
		Employee employee = employeeDao.getEmployeeById(id);
		if(employee != null) {
			return employeeDao.updateCnoById(id, new_cno);
		}
		else {
			return false;
		}
	}

//===================================================================================================================

	public Employee getEmployeeById(int id) {
		Employee employee = employeeDao.getEmployeeById(id);
		if(employee != null) {
			return employeeDao.getEmployeeById(id);
		}
		else {
			return null;
		}
		
	}

//===================================================================================================================

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();

	}

//=================================================================================================================

}
