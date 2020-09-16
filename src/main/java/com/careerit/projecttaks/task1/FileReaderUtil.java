package com.careerit.projecttaks.task1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class FileReaderUtil {

	private static String fileName = "/employees.txt";

	private FileReaderUtil() {

	}

	public static List<Employee> loadEmployeeFromFile() {
		List<Employee> empList = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(FileReaderUtil.class.getResource(fileName).toURI()));
			empList = lines.stream().skip(1).map(line -> convertToObject(line)).collect(Collectors.toList());
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		return empList;
	}

	private static Employee convertToObject(String line) {
		String[] arr = line.split(",");
		int empno = Integer.parseInt(arr[0]);
		String name = arr[1];
		String dept = arr[2];
		double salary = Double.parseDouble(arr[3]);
		Employee emp = Employee.builder().empno(empno).name(name).dept(dept).salary(salary).build();
		return emp;
	}
}
