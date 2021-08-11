package com.cts.lsd.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cts.lsd.model.Employee;

public class App02CompartorWithLambdas {

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

		Collections.sort(emps);
		for (Employee e : emps) {
			System.out.println(e);
		}

		System.out.println("------------------------------------");
		Comparator<Employee> empNameComparator = (e1,e2) -> e1.getEname().compareTo(e2.getEname());
		Collections.sort(emps,empNameComparator);
		for (Employee e : emps) {
			System.out.println(e);
		}

		System.out.println("------------------------------------");
		Comparator<Employee> empJoinDateComparator = 
				(e1,e2) -> e1.getDateOfJoining().compareTo(e2.getDateOfJoining());
		Collections.sort(emps,empJoinDateComparator);
		for (Employee e : emps) {
			System.out.println(e);
		}

		System.out.println("------------------------------------");
		Collections.sort(emps,(e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
		for (Employee e : emps) {
			System.out.println(e);
		}

	}

}
