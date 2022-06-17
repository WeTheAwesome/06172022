package com.revature.myclasses;

public class Employee {
int id;
String name;
String dept;
double salary;

public void createEmployee(int id, String name, String dept, double salary) {
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}

public void displayEmployee() {
	System.out.println("ID: "+this.id+" Name: "+this.name+
			" Department: "+this.dept+" Salary: "+this.salary);
}
}
