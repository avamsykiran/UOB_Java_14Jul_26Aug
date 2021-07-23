package com.cts.oopd.ui;

import com.cts.oopd.model.ContractEmployee;
import com.cts.oopd.model.Director;
import com.cts.oopd.model.Employee;
import com.cts.oopd.model.Manager;

public class App02InheretenceDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Vamsy", 4560);
		ContractEmployee cemp = new ContractEmployee(102, "Sagar", 5678, 10);
		Manager m = new Manager(103, "Indhikaa", 7689, 789);
		Director d = new Director(104, "Suseela", 7890, 990, 50);
		
		System.out.println(emp);
		System.out.println(cemp);
		System.out.println(m);
		System.out.println(d);
	}
}
