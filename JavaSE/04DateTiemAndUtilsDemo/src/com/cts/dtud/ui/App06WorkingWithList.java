package com.cts.dtud.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cts.dtud.model.Employee;
import com.cts.dtud.service.EmployeeNameComparator;
import com.cts.dtud.service.Swapper;

public class App06WorkingWithList {

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
		Collections.sort(emps, new EmployeeNameComparator());
		for (Employee e : emps) {
			System.out.println(e);
		}

	}

}
