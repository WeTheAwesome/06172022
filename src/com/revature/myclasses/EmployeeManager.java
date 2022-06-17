package com.revature.myclasses;

public class EmployeeManager {
	public static void main(String[] args) {
		
		Employee [] employee=new Employee[5];
		
		for(int i=0;i<employee.length; i++)
			employee[i]=new Employee();
		
		employee[0].createEmployee(111, "Jake", "IT", 20.20);
		employee[1].createEmployee(222, "Jane", "Accounting", 20.20);
		employee[2].createEmployee(333, "John", "Security", 20.20);
		employee[3].createEmployee(444, "Josh", "CEO", 20000.20);
		employee[4].createEmployee(555, "Jazz", "HR", 20.20);
		
		for(int j=0; j<employee.length; j++)
			employee[j].displayEmployee();
	}
}
