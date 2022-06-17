package com.revature.myclasses;

public class StudentManager {
	public static void main(String[] args) {
		
		//Create object of student class
		Student s1=new Student();
		s1.createStudent(444, "Joshua", "C++");
		
		//call the display method
		s1.displayStudent();
		
		Student[] student= new Student[5];
		for(int i=0; i<student.length; i++)
			student[i]=new Student();
		
		student[0].createStudent(105, "AAA", "BBB");
		student[1].displayStudent();
	}
}
