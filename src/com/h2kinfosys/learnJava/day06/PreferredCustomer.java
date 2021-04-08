package com.h2kinfosys.learnJava.day06;

public class PreferredCustomer extends Customer{

	// Compiler provides a call to Parent class Constructor - no arg only
	public PreferredCustomer(String firstName) {
		super(firstName); // Explicit Parent class Constructor Call
		System.out.println("Constructor PreferredCustomer");
	}
	
	public PreferredCustomer(String firstName, String lastName) {
		this(firstName);
		this.lastName = lastName;
		super.zipCode = "30080";
		System.out.println(this.firstName + " " + this.lastName);
	}
	
	// Overriding
	public float discount() {
		return 5.0f;
	}
}
