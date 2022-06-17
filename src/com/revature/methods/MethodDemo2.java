package com.revature.methods;
import java.util.Scanner;
public class MethodDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int n1=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int n2=sc.nextInt();
		int res = sum(n1,n2);//function call with arguments
		System.out.println("Sum of "+n1+" and "+n2+" equals "+res);
	}
	
	public static int sum(int x, int y) {
		int result= x+y;
		//System.out.println("Sum of "+x+" and "+y+" is "+result);
		return result;
	}
}
