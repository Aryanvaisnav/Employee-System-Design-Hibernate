package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class GetEmployeeById {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService(); 
		int id = 2;
		Employee employee = employeeService.getEmployeeById(id);
		
		if(employee != null) {
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getCno());
		}
		else {
			System.out.println("There is no employee with this id = " + id);
		}
		
	}

}
