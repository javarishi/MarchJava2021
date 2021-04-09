package com.h2kinfosys.learnJava.day06;

/*
 * final  method - cannot overridden
 * final class - Cannot be extended 
 * final variable - declared value cannot be changed
 * 
 */

public class Customer extends GenericCustomer{

	String firstName = "Value";
	String lastName;
	String zipCode;
	final String sampleConstant = "Final Value, Cannot be changed";
	
	public Customer(String firstName) {
		System.out.println("Customer Constructor");
		this.firstName = firstName;
	}
	
	
	
	
	public boolean processPromotions(String promoCode) {
		System.out.println("Customer recevied Basic Promo " + promoCode);
		return false;
	}




	@Override
	public float discount() {
		return 2.0f;
	}
}
