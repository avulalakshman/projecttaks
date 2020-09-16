package com.careerit.projecttaks.task1;

import java.util.List;

public interface EmployeeService {

	List<String> getEmployeeNames();

	List<Employee> getEmployeeByDept(String dept);

	List<Employee> getMaxPaidEmployees();

	List<Employee> minPaidEmployees();

	List<Employee> search(String str);

	EmployeeStatDTO getSalaryStatInfo();
}
