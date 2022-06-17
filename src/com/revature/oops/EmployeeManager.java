package com.revature.oops;

public class EmployeeManager {
	public static void main(String[] args) {
		//SalariedEmployee se=new SalariedEmployee();
		
		SalariedEmployee se=new SalariedEmployee(222, "Jill", 5);
		double salSE=se.calculateSalary(se.getDaysPresent());
		System.out.println("Id: "+se.getId()+" Name: "+se.getName()+
				" Days Present: "+se.getDaysPresent()+" Salary: "+salSE);
		
		ContractedEmployee ce=new ContractedEmployee(111, "Jack", 40);
		double salCE=ce.calculateSalary(ce.getHoursWorked());
		System.out.println("Id: "+ce.getId()+" Name: "+ce.getName()+
				" Days Present: "+ce.getHoursWorked()+" Salary: "+salCE);
	}
}
