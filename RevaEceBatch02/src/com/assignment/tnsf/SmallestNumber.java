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
		
		if(num1==num2 && num2==num3) {
			System.out.println("All numbers are equal");
		}
		else {
	        // Using ternary operator to find the smallest number
	        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

	        System.out.println("The smallest number is: " + smallest);
		}
		
	
	}

}
		
