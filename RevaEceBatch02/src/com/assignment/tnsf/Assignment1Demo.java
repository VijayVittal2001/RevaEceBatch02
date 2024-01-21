package com.assignment.tnsf;

import java.util.Scanner;

public class Assignment1Demo {

	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();
		String Name,source,destination;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		Name=sc.nextLine();
		System.out.println("Enter the source");
		source=sc.nextLine();
		System.out.println("Enter the Destinatrion");
		destination=sc.nextLine();
		
		obj.setName(Name);
		obj.setSource(source);
		obj.setDestination(destination);
		
		System.out.println("Dear " + obj.getName() + ", welcome onboard with service from " + obj.getSource()
        + " to " + obj.getDestination() + ". Thank you for choosing Sky Airlines. Enjoy your flight");

		sc.close();

	}

}
