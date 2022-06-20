package com.revature.myarray;

public class NumArray {
	public static void main(String[] args) {
		//array
		int num[]=new int[10];
		
		num[0]=1;
		num[1]=10;
		num[2]=2;
		num[3]=9;
		num[4]=3;
		num[5]=8;
		num[6]=4;
		num[7]=7;
		num[8]=5;
		num[9]=6;
		
		for(int n:num)
			System.out.print(n+" ");
		
		//sum of array
		System.out.println();
		int sum =0;
		for(int n:num)
			sum = sum+n;
		
		System.out.println("Sum: "+sum);
		
		//evens and sum
		int evens=0;
		for(int n:num) {
			if (n%2==0) {
				System.out.print(n+" ");
				evens=evens+n;
			}
		}
		System.out.println();
		System.out.println("Sum of evens: "+evens);
		
		//odds and sum
		int odds=0;
		for(int n:num) {
			if(n%2!=0) {
				System.out.print(n+" ");
				odds=odds+n;
			}
		}
		System.out.println();
		System.out.println("Sum of odds: "+odds);
		
		//ascending array
		int ascend[]=new int[10];
		int temp=0;
		
		for(int i=0;i<ascend.length;i++)
			ascend[i]=num[i];
		
		System.out.println();
		for(int a:ascend)
			System.out.print(a+" ");
		
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
		
		for(int a:ascend)
			System.out.print(a+" ");
		
		//descending array
		int descend[]=new int[10];
		int temp2=0;
		
		for(int i=0;i<descend.length;i++)
			descend[i]=num[i];
		
		System.out.println();
		for(int d:descend)
			System.out.print(d+" ");
		
		for(int i=0;i<descend.length;i++) {
			for(int j=i+1;j<descend.length;j++) {
				if(descend[i]<descend[j]) {
					temp2=descend[i];
					descend[i]=descend[j];
					descend[j]=temp2;
				}
			}
		}
		System.out.println();
		
		for(int d:descend)
			System.out.print(d+" ");
		
		//average of array
		System.out.println();
		System.out.println();
		int average= sum/num.length;
		System.out.println("Average: "+average);
		
		//greatest 3
		int a=0, b=0, c=0;
		for(int i=0; i<num.length;i++) {
			if(num[i]>a)
				a=num[i];
			else if(num[i]>b)
				b=num[i];
			else if(num[i]>c)
				c=num[i];
		}
		System.out.println(a+" "+b+" "+c);
		
		//least 3
		int x=a, y=a, z=a;
		for(int i=0; i<num.length;i++) {
			if(num[i]<x)
				x=num[i];
			else if(num[i]<y)
				y=num[i];
			else if(num[i]<z)
				z=num[i];
		}
		System.out.println(x+" "+y+" "+z);
				
				
	}
}
