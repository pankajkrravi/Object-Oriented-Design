package com.goomo.Employee.DAO;

import com.goomo.Employee.POJO.Employee;

public class EmployeeDAO { // used for data storage i.e CRUD operation

	public void saveEmployee(Employee employee) {
		//DatabaseConnectionManager connectionManager=DatabaseConnectionManager.
		System.out.println("Saved Employee to th DB :: "+employee);

	}

	public void deleteEmployee(Employee employee) {
         System.out.println("deleted Employee from DB : "+employee);
	}
}
