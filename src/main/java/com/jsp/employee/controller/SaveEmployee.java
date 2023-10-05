package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class SaveEmployee {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee();
		employee.setName("Jack");
		employee.setEmail("jack@mail.com");
		employee.setCno(9464686435l);
		
		Employee e = employeeService.saveEmployee(employee);
		
		if(e != null) {
			System.out.println("Saved");
		}
		else {
			System.out.println("Not Saved");
		}
		
	}

}
