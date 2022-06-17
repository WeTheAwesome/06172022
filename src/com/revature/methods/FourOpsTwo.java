package com.revature.methods;

import java.util.Scanner;

public class FourOpsTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int n1=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int n2=sc.nextInt();
		int res = add(n1,n2);//function call with arguments
		int res2= subtract(n1,n2);
		int res3= multiply(n1,n2);
		int res4= divide(n1,n2);
		System.out.println("Sum of "+n1+" and "+n2+" equals "+res);
		System.out.println("Difference of "+n1+" and "+n2+" equals "+res2);
		System.out.println("Multiplicative of "+n1+" and "+n2+" equals "+res3);
		System.out.println("Quotient of "+n1+" and "+n2+" equals "+res4);
	}
	
	public static int add(int x, int y) {
		int result= x+y;
		return result;
	}
	
	public static int subtract(int x, int y) {
		int result= x-y;
		return result;
	}
	
	public static int multiply(int x, int y) {
		int result= x*y;
		return result;
	}
	
	public static int divide(int x, int y) {
		int result= x/y;
		return result;
	}
}
