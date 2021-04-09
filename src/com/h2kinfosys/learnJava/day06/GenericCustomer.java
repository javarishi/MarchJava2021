package com.h2kinfosys.learnJava.day06;

/*
 * abstract class cannot be instantiated
 * abstract class can carry normal methods
 * abstract methods can only be present in abstract class
 * abstracted methods enforced on non-abstract children
 */

public abstract class GenericCustomer {
	
	int approxAge;
	int gender;
	int status;
	int physicalStatus;
	
	public void checkApplicable(String zipCode) {
		if(zipCode.equals("30080")) {
			System.out.println("Provide Discount");
		}else {
			System.out.println("Sorry no discount");
		}
	}
	
	public abstract float discount();
	
	

}
