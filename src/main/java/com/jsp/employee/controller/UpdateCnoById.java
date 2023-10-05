package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class UpdateCnoById {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		int id =5;
		long new_cno = 9821156733l;
		boolean e = employeeService.updateCnoById(id, new_cno);
		
		if(e == true) {
			System.out.println("Contact Number is updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
