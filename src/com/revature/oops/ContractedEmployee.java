package com.revature.oops;

public class ContractedEmployee extends Employee{
private int hoursWorked;

public ContractedEmployee() {
	super();
}

public ContractedEmployee(int id, String name, int hoursWorked) {
	super(id, name);
	this.hoursWorked = hoursWorked;
}

public int getHoursWorked() {
	return hoursWorked;
}

public void setHoursWorked(int hoursWorked) {
	this.hoursWorked = hoursWorked;
}

@Override
public double calculateSalary(int worked) {
	return 10.5*worked;
}
}