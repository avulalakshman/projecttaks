package com.careerit.projecttaks.task1;

import java.util.List;

public class Manager {

		public static void main(String[] args) {
			
				EmployeeService empService = new EmployeeServiceImpl();
				// Q1
				List<String> names = empService.getEmployeeNames();
				names.stream().forEach(e->{
					System.out.println(e);
				});
				//Q2
				
				String dname = "QA";
				List<Employee> list = empService.getEmployeeByDept(dname);
				System.out.println(list);
		}
}
