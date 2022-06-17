package com.revature.mypackage;

public class ArrayDemo {
		public static void main(String[] args) {
			
			int marks[]=new int[5];
			int[]arr2= {1,2,3,4,5};
			
			marks[0]=10;
			marks[1]=12;
			marks[2]=14;
			marks[3]=16;
			marks[4]=17;
			
			System.out.println("Length of Marks Array: "+arr2.length);
			System.out.println("Dispalying the third element: "+marks[2]);
			
			for(int i=0;i<marks.length;i++)
				System.out.println(marks[i]);
			//Enhanced For Loop
			for(int m:marks)
				System.out.println(m);
		}
}
