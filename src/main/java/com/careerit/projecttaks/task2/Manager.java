package com.careerit.projecttaks.task2;

import java.util.List;

import com.careerit.projecttaks.task2.service.IplstatService;
import com.careerit.projecttaks.task2.service.IplstatServiceImpl;

public class Manager {

	public static void main(String[] args) {

		IplstatService service = new IplstatServiceImpl();
		//Q1 Get all team labels
		List<String> labels = service.getTeamLabels();
		labels.stream().forEach(System.out::println);
		
		//Q2 Get players by label (CSK)
		
		
		
	}
}
