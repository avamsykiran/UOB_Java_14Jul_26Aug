package com.cts.oopd.model;

public class Director extends Manager {
	
	private double sharePercent;
	
	public Director() {
		System.out.println("Director constructor executed");
	}
	
	public Director(int empId, String name, double salary,double allowence,double sharePercent) {
		this();
		this.setEmpId(empId);
		this.setName(name);
		this.setSalary(salary);
		this.setAllowence(allowence);
		this.sharePercent=sharePercent;
	}	
	
	public double getSharePercent() {
		return sharePercent;
	}

	public void setSharePercent(double sharePercent) {
		this.sharePercent = sharePercent;
	}

	@Override
	public String toString() {
		return "Director [EmpId=" + getEmpId() 
		+ ", Name="	+ getName() + ", Salary=" + getSalary() 
		+ ", allowence" + getAllowence() +",sharePercent="+sharePercent + "]";
	}
}
