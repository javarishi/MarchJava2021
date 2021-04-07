package com.h2kinfosys.learnJava.day04;

public class Customer {

	// Instance Variables
	String customerId;
	String customerName;
	String customerAddress;
	
	// Class Variables - Static
	static String storeName = "The Home Depot";
	
	public static void main(String[] args) {
		// How to create Object of a class
		// ClassName instanceName = new ClassName();
		Customer custOne = new Customer();
		Customer custTwo = new Customer();
		
		custOne.customerId = "0111";
		custOne.customerName = "Neil Armstrong";
		custOne.customerAddress = "3305 Spring Hill Pwky";
		Customer.storeName = "Best Buy Inc";
		
		System.out.println("CustOne ID " + custOne.customerId);
		System.out.println("CustOne storeName " + Customer.storeName);
		
		System.out.println("CustTwo ID " + custTwo.customerId);
		System.out.println("CustTwo storeName " + Customer.storeName);
	}
}
