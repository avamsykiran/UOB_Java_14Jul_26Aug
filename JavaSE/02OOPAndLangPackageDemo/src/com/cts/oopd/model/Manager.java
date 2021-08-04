package com.cts.oopd.model;

public class Manager extends Employee {
	
	private double allowence;
	
	public Manager() {
		System.out.println("Manager constructor executed");
	}
	
	public Manager(int empId, String name, double salary,double allowence) {
		this();
		this.setEmpId(empId);
		this.setName(name);
		this.setSalary(salary);
		this.allowence=allowence;
	}

	public double getAllowence() {
		return allowence;
	}

	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}

	@Override
	public String toString() {
		return "Manager [EmpId=" + getEmpId() 
		+ ", Name="	+ getName() + ", Salary=" + getSalary() 
		+ ", allowence" + allowence + "]";
	}
}
