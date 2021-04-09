package com.h2kinfosys.learnJava.day06;

public class Tester {

	public static void main(String[] args) {
		// Constructors cons = new Constructors("sample", 100);
		
		// Customer cust = new Customer();
		// System.out.println(cust.discount());
		
		PreferredCustomer pCust = new PreferredCustomer("Neil", "Armstrong");
		System.out.println(pCust.discount());
		System.out.println(pCust.processPromotions("eoiruweiru"));
		pCust.sendPromotionalEmails("xyz@abc.com");
		
		
		
		// ClassName instanceName = new Constructor()
		// ReferenceType instanceName = new InstanceType()
		// Car my_camry = new Camry()
		Customer cust = new PreferredCustomer("Buzz", "Aldrine");
		System.out.println(cust.discount());
		// Visibility of members comes from Reference Type
		// Execution of the method - instance type
		GenericCustomer gCust = new PreferredCustomer("david", "Bryan");
		gCust.checkApplicable("33629");
		System.out.println(gCust.discount());
	}

}
