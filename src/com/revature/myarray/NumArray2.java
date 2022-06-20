package com.revature.myarray;
import java.util.Scanner;

public class NumArray2 {
	public static void main(String[] args) {
		//Creating the array
		Scanner sc = new Scanner(System.in);
		int numArr[]=new int[10];
		System.out.println("Enter 10 numbers into the array");
		
		for(int i=0; i<numArr.length; i++)
			numArr[i] = sc.nextInt();
		
		//display array
		NumArray2 na=new NumArray2();
		na.displayArray(numArr);
		
		//calculate sum
		int sum=na.sumOfArray(numArr);
		
		//calculate average
		na.avgOfArray(sum, numArr);
		
		//evens and sum
		na.evens(numArr);
		//odds and sum
		na.odds(numArr);
		
		//ascending array
		na.ascend(numArr);
		//descending array
		na.descend(numArr);
		
		//greatest 3 numbers
		na.greatest(numArr);
		//least 3 numbers
		na.least(numArr);
		
	}
	
	public void least(int[]numArr) {
		int x=numArr[0], y=numArr[1], z=numArr[2];
		for(int i=0; i<numArr.length;i++) {
			if(numArr[i]<x) {
				z=y;
				y=x;
				x=numArr[i];
			}
			else if(numArr[i]<y) {
				z=y;
				y=numArr[i];
			}
			else if(numArr[i]<z)
				z=numArr[i];
		}
		System.out.println("Least 3 numbers: "+x+" "+y+" "+z);
				
	}
	
	public void greatest(int[]numArr) {
		System.out.println();
		System.out.println();
		int a=0, b=0, c=0;
		for(int i=0; i<numArr.length;i++) {
			if(numArr[i]>a) {
				b=a;
				a=numArr[i];
			}
			else if(numArr[i]>b) {
				c=b;
				b=numArr[i];
			}
			else if(numArr[i]>c)
				c=numArr[i];
		}
		System.out.println("Greatest 3 numbers: "+a+" "+b+" "+c);
	}
	
	public void descend(int[]numArr) {
		//ascending array
		int descend[]=new int[10];
		int temp=0;
			
		for(int i=0;i<descend.length;i++)
			descend[i]=numArr[i];
		
		for(int i=0;i<descend.length;i++) {
			for(int j=i+1;j<descend.length;j++) {
				if(descend[i]<descend[j]) {
					temp=descend[i];
					descend[i]=descend[j];
					descend[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Descending Order: ");
		for(int a:descend)
			System.out.print(a+" ");
	}
	
	public void ascend(int[]numArr) {
		//ascending array
		int ascend[]=new int[10];
		int temp=0;
				
		for(int i=0;i<ascend.length;i++)
			ascend[i]=numArr[i];
			
		for(int i=0;i<ascend.length;i++) {
			for(int j=i+1;j<ascend.length;j++) {
				if(ascend[i]>ascend[j]) {
					temp=ascend[i];
					ascend[i]=ascend[j];
					ascend[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Ascending Order: ");
		for(int a:ascend)
			System.out.print(a+" ");
	}
	
	public void odds(int []numArr) {
			System.out.println();
			System.out.print("Only odds:");
			int odds=0;
			for(int n:numArr) {
				if (n%2!=0) {
					System.out.print(n+" ");
					odds=odds+n;
				}
			}
			System.out.println();
			System.out.println("Sum of odds: "+odds);
		}
		
	public void evens(int []numArr) {
		System.out.println();
		System.out.print("Only evens:");
		int evens=0;
		for(int n:numArr) {
			if (n%2==0) {
				System.out.print(n+" ");
				evens=evens+n;
			}
		}
		System.out.println();
		System.out.println("Sum of evens: "+evens);
	}
		
	public void avgOfArray(int sum, int [] numArr) {
		int avg=sum/numArr.length;
		System.out.println("Average of Array: "+avg);
	}
		
	public int sumOfArray(int[] numArr) {
		System.out.println();
		int sum =0;
		for(int n:numArr)
			sum = sum+n;
		System.out.println("Sum of Array: "+sum);
		return sum;
		}
	
	public void displayArray(int[] array) {
		System.out.println();
		System.out.print("Array: ");
		for(int a:array)
			System.out.print(a+" ");
		System.out.println();
	}
}
