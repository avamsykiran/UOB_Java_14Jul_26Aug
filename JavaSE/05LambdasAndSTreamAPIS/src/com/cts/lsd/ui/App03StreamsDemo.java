package com.cts.lsd.ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.cts.lsd.model.Employee;

public class App03StreamsDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(110L, "Zeenith", 45670.0, LocalDate.of(2000, Month.JANUARY, 1),new TreeSet<>()));
		emps.add(new Employee(111L, "Mona", 55670.0, LocalDate.of(2001, Month.JUNE, 1),new TreeSet<>()));
		emps.add(new Employee(101L, "Avinash", 35670.0, LocalDate.of(2017, Month.JULY, 1),new TreeSet<>()));
		emps.add(new Employee(112L, "Kalyani", 15670.0, LocalDate.of(2020, Month.FEBRUARY, 1),new TreeSet<>()));
		emps.add(new Employee(104L, "Latha", 95670.0, LocalDate.of(2002, Month.MARCH, 1),new TreeSet<>()));
		emps.add(new Employee(108L, "Barva", 15670.0, LocalDate.of(2000, Month.MAY, 1),new TreeSet<>()));
		emps.add(new Employee(109L, "Bharathi", 25670.0, LocalDate.of(2011, Month.APRIL, 1),new TreeSet<>()));
		emps.add(new Employee(115L, "Cendrilla", 25070.0, LocalDate.of(2010, Month.DECEMBER, 1),new TreeSet<>()));
		emps.add(new Employee(113L, "Darwin", 99670.0, LocalDate.of(2000, Month.OCTOBER, 1),new TreeSet<>()));
		emps.add(new Employee(107L, "Vamsy", 12670.0, LocalDate.of(2001, Month.JANUARY, 1),new TreeSet<>()));
		
		emps.get(0).getSkills().addAll(Arrays.asList(new String[]{"Java","Angular","MySQL"}));
		emps.get(1).getSkills().addAll(Arrays.asList(new String[]{"Angular","MySQL"}));
		emps.get(2).getSkills().addAll(Arrays.asList(new String[]{".Net","Angular","MySQL"}));
		emps.get(3).getSkills().addAll(Arrays.asList(new String[]{"Java","MySQL"}));
		emps.get(4).getSkills().addAll(Arrays.asList(new String[]{"Java","ReactJS","MySQL"}));
		emps.get(5).getSkills().addAll(Arrays.asList(new String[]{"Java","VueJS","MySQL"}));
		emps.get(6).getSkills().addAll(Arrays.asList(new String[]{"Java","VueJS","MySQL"}));
		emps.get(7).getSkills().addAll(Arrays.asList(new String[]{".Net","ReactJS","MySQL"}));
		emps.get(8).getSkills().addAll(Arrays.asList(new String[]{"Java","ReactJS","MongoDB"}));
		emps.get(9).getSkills().addAll(Arrays.asList(new String[]{"Java","Angular","MongoDB"}));
		
		emps.stream().forEach(e -> System.out.println(e));
		emps.stream().forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * 0.05)));
		System.out.println("--------------------------------------------");
		emps.stream().forEach(System.out::println);

		System.out.println("--------------------------------------------");
		Optional<Employee> result = emps.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
		if (result.isPresent())
			System.out.println(result.get());

		System.out.println("--------------------------------------------");
		result = emps.stream().reduce((e1, e2) -> e1.getDateOfJoining().isBefore(e2.getDateOfJoining()) ? e1 : e2);
		if (result.isPresent())
			System.out.println(result.get());

		System.out.println("--------------------------------------------");
		Set<Employee> empSet = emps.stream().collect(Collectors.toSet());
		Map<Long, String> empNameAndIdMap = emps.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getEname));
		System.out.println(empNameAndIdMap);
		System.out.println("--------------------------------------------");
		emps.stream().filter(e -> e.getSalary() >= 50000).forEach(System.out::println);

		System.out.println("--------------------------------------------");
		List<String> empNames = emps.stream() // a stream of Employee objects
				.map(e -> e.getEname()) // a stream of strings (each string is an empName)
				.collect(Collectors.toList());// collecting into a list of strings
		System.out.println(empNames);
		
		System.out.println("--------------------------------------------");
		for (Employee e : emps) {
			System.out.println(
					String.format("Hello %s, it seems like you are drawing INR.%.2f per "+
								"month and you are serving since %s",
					e.getEname(), e.getSalary(), e.getDateOfJoining()));
		}
		
		System.out.println("--------------------------------------------");
		emps.stream()
				.map(e -> String.format(
						"Hello %s, it seems like you are drawing INR.%.2f per "+
								"month and you are serving since %s",
						e.getEname(), e.getSalary(), e.getDateOfJoining()))
				.forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		 List<String> skills = emps.stream() 
				//.map(e -> e.getSkills()) // a stream of 'set of strings'
		 		.flatMap(e -> e.getSkills().stream()) // a stream of strings
		 		.distinct()
		 		.collect(Collectors.toList());
		System.out.println(skills);

	}

}
