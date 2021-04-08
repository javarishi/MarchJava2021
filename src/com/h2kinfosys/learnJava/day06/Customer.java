package com.h2kinfosys.learnJava.day06;

public class Customer {

	String firstName;
	String lastName;
	String zipCode;
	
	public Customer(String firstName) {
		System.out.println("Customer Constructor");
		this.firstName = firstName;
	}
	
	
	public float discount() {
		return 2.0f;
	}
}
