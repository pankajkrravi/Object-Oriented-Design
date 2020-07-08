package com.goomo.Employee.reporting;

import com.goomo.Employee.POJO.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee objectEmployee, FormatType formatType) {
		super(objectEmployee, formatType);
	}
    public String getFormattedEmployee()
    {
    	return getFormattedvalue();
    }
}
