package com.jsp.employee.controller;

import java.util.List;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class GetAllEmployees {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		List<Employee> list  = employeeService.getAllEmployees();
		
		for(Employee e : list) {
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
			System.out.println("=================================================================================================================");
		}
		
		

	}

}
