package com.jsp.employee.controller;


import com.jsp.employee.service.EmployeeService;

public class UpdateEmailById {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		int id = 5;
		String new_email = "james@mail.com";
		boolean e = employeeService.updateEmailById(id, new_email);
		
		if(e == true) {
			System.out.println("Email is updated");
		}
		else {
			System.out.println("Not Updated");
		}
	}

}
