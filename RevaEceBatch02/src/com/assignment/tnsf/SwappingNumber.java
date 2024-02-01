package com.assignment.tnsf;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		a =sc.nextInt();
		System.out.println("Enter b :");
		b =sc.nextInt();
		
		System.out.println(" numbers before swapping :"+ a +" and "+ b +"");
		
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println(" numbers after swapping :"+ a +" and "+ b +""); 


	}

}
