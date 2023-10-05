package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class UpdateNameById {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		int id = 5;
		String new_name = "James";
		boolean e = employeeService.updateNameById(id, new_name);
		
		if(e == true) {
			System.out.println("Name is updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
