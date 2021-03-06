package com.goomo.Employee.Controller;

import com.goomo.Employee.DAO.EmployeeDAO;
import com.goomo.Employee.POJO.Employee;
import com.goomo.Employee.reporting.EmployeeReportFormatter;
import com.goomo.Employee.reporting.FormatType;

public class ClientModule {
	public static void main(String[] args) {
		Employee pankaj = new Employee(1, "Pankaj", "Technology", true);
		ClientModule.hireEmployee(pankaj);
		printEmployeeReporrt(pankaj,FormatType.XML);
	}

	public static void hireEmployee(Employee employee) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(employee);

	}

	public static void termivateEmployee(Employee employee) {
		EmployeeDAO dao = new EmployeeDAO();
		dao.deleteEmployee(employee);
	}

	public static void printEmployeeReporrt(Employee employee,FormatType formatType) {
        EmployeeReportFormatter employeeReportFormatter=new EmployeeReportFormatter(employee, formatType);
        String formattedEmployee = employeeReportFormatter.getFormattedEmployee();
        System.out.println(formattedEmployee);
	}
}