package com.h2kinfosys.learnJava.day06;

public class Tester {

	public static void main(String[] args) {
		// Constructors cons = new Constructors("sample", 100);
		
		// Customer cust = new Customer();
		// System.out.println(cust.discount());
		
		PreferredCustomer pCust = new PreferredCustomer("Neil", "Armstrong");
		System.out.println(pCust.discount());
	}

}
