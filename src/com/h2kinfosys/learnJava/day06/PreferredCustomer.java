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
	
	// 1. Access Modifier - cannot be more restrictive, you can increase visibility
	// 2. Return type should be either same or co-variant (class, subclass)
	// 3. Method name - exactly the same 
	// 4. Parameters - exactly the same
	// 5. Exception - or co-variant (class, subclass)
	@Override
	public float discount() {
		return 5.0f;
	}
	
	
	@Override
	public boolean processPromotions(String promoCode) {
		super.processPromotions(promoCode);
		System.out.println("Additional Discount with Promocode " + promoCode);
		return true;
	}
	
	
	public void sendPromotionalEmails(String emailId) {
		System.out.println("Promotional Email sent to " + emailId);
	}
	
	
}
