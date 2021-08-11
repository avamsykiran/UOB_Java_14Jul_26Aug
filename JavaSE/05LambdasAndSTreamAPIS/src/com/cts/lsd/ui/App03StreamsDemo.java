package com.cts.lsd.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cts.lsd.model.Employee;

public class App03StreamsDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(110L, "Zeenith", 45670.0, LocalDate.of(2000, Month.JANUARY, 1)));
		emps.add(new Employee(111L, "Mona", 55670.0, LocalDate.of(2001, Month.JUNE, 1)));
		emps.add(new Employee(101L, "Avinash", 35670.0, LocalDate.of(2017, Month.JULY, 1)));
		emps.add(new Employee(112L, "Kalyani", 15670.0, LocalDate.of(2020, Month.FEBRUARY, 1)));
		emps.add(new Employee(104L, "Latha", 95670.0, LocalDate.of(2002, Month.MARCH, 1)));
		emps.add(new Employee(108L, "Barva", 15670.0, LocalDate.of(2000, Month.MAY, 1)));
		emps.add(new Employee(109L, "Bharathi", 25670.0, LocalDate.of(2011, Month.APRIL, 1)));
		emps.add(new Employee(115L, "Cendrilla", 25070.0, LocalDate.of(2010, Month.DECEMBER, 1)));
		emps.add(new Employee(113L, "Darwin", 99670.0, LocalDate.of(2000, Month.OCTOBER, 1)));
		emps.add(new Employee(107L, "Vamsy", 12670.0, LocalDate.of(2001, Month.JANUARY, 1)));

		emps.stream().forEach(e -> System.out.println(e));
		emps.stream().forEach(e -> e.setSalary(e.getSalary()+(e.getSalary()*0.05)));
		System.out.println("--------------------------------------------");
		emps.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		Optional<Employee> result = emps.stream()
				.reduce((e1,e2) -> e1.getSalary()>e2.getSalary()?e1:e2);
		if(result.isPresent())
			System.out.println(result.get());
		
		System.out.println("--------------------------------------------");
		 result = emps.stream()
				.reduce((e1,e2) -> e1.getDateOfJoining().isBefore(e2.getDateOfJoining())?e1:e2);
		if(result.isPresent())
			System.out.println(result.get());
		
		
	}

}
