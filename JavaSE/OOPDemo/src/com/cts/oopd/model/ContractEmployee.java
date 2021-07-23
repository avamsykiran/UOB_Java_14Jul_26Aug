package com.cts.oopd.model;

public class ContractEmployee extends Employee {
	
	private int contractDurtion;
	
	public ContractEmployee() {
		System.out.println("ContractEmployee constructor executed");
	}
	
	public ContractEmployee(int empId, String name, double salary,int contractDuration) {
		this();
		this.setEmpId(empId);
		this.setName(name);
		this.setSalary(salary);
		this.contractDurtion=contractDuration;
	}

	public int getContractDurtion() {
		return contractDurtion;
	}

	public void setContractDurtion(int contractDurtion) {
		this.contractDurtion = contractDurtion;
	}

	@Override
	public String toString() {
		return "ContractEmployee [EmpId=" + getEmpId() 
		+ ", Name="	+ getName() + ", Salary=" + getSalary() 
		+ ", ContractDurtion=" + contractDurtion + "]";
	}
}
