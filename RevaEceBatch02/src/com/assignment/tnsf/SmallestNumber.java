package com.assignment.tnsf;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		System.out.println("Enter num3");
		int num3=sc.nextInt();
		
		int smallest = findSmallest(num1,num2,num3);
		System.out.println("The smallest number is="+ smallest);
			

	}

	private static int findSmallest(int a, int b, int c) {
		if(a==b && b==c && c==a) {
			System.out.println("All numbers are equal");
		}
		else if (a<=b && a<=c) {
			return a;
		}
		else if (b<=a && b<=c) {
			return b;
		}
		else {
			return c;
		}
			
		return 0;
	}

}
