package com.h2kinfosys.learnJava.day01;

public class Operators {

	public static void main(String[] args) {
		// Mathematical Operators - + - * / % 
		int billingAmount = 100;
		int tax = 12;
		int discount = 25;
		
		System.out.println("Addition " + (billingAmount + tax));
		System.out.println("Subtraction " + ((billingAmount + tax) - discount));
		System.out.println("Multiplication " + (discount * 2));
		System.out.println("Division " + (billingAmount / 2));
		System.out.println("Reminder of division " + (discount % 2));

		// Increment or decrement operator
		// i++ --> Use the value then increase 
		// ++i --> Increase the value then use
		int i = 1;
		System.out.println("Increment " + i++);
		System.out.println("Value of i " + i);
		System.out.println("Increment " + (++i));
		//HW : i-- and --i
	}

}
