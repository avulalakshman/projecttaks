package com.careerit.projecttaks.task1;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> empList = FileReaderUtil.loadEmployeeFromFile();
	
	@Override
	public List<String> getEmployeeNames() {
		return empList.stream().map(e->e.getName()).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getMaxPaidEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> minPaidEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeStatDTO getSalaryStatInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
