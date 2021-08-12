package com.cts.lsd.model;

import java.time.LocalDate;
import java.util.Set;

public class Employee implements Comparable<Employee>{

	private Long empId;
	private String ename;
	private Double salary;
	private LocalDate dateOfJoining;
	private Set<String> skills;
	
	public Employee() {}

	public Employee(Long empId, String ename, Double salary, LocalDate dateOfJoining) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.skills=null;
	}
	
	public Employee(Long empId, String ename, Double salary, LocalDate dateOfJoining, Set<String> skills) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.skills = skills;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + ", dateOfJoining="
				+ dateOfJoining + "]";
	}

	//e1.compareTo(e2)
	@Override
	public int compareTo(Employee o) {
		//compare 'this' with 'o'
		return this.empId.compareTo(o.empId);
	}
	
}
