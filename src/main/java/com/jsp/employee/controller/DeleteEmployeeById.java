package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class DeleteEmployeeById {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		int id = 6;
		boolean e = employeeService.deleteEmployeeById(id);
		
		if(e == true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}
		

	}

}
