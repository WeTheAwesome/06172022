package com.revature.oops;

public class SalariedEmployee extends Employee{
private int daysPresent;

public SalariedEmployee() {
	super();
	System.out.println("salaried Employee Default Constructor");
}

public SalariedEmployee(int id, String name, int daysPresent) {
	super(id, name);
	this.setDaysPresent(daysPresent);
	System.out.println("Parameterized Constructor SE");
}

public int getDaysPresent() {
	return daysPresent;
}

public void setDaysPresent(int daysPresent) {
	this.daysPresent = daysPresent;
}

@Override
public double calculateSalary(int worked) {
	return 100.00*worked;
}
}
