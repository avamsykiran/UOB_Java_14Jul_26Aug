package com.cts.dtud.service;

import java.util.Comparator;

import com.cts.dtud.model.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEname().compareTo(o2.getEname());
	}

}
