package com.careerit.projecttaks.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeStatDTO {

	private double maxSalary;
	private double minSalary;
	private double avgSalary;
	private int countOfEmployee;
}
