package com.h2kinfosys.learnJava.day05;

public class TestMethods {

	/*
	 * Constructor Rule
	 * 1. Access Modifier
	 * 2. Return type - No return type
	 * 3. Method Name - ClassName
	 * 4. Parameters / Arguments -Yes can have parameters
	 * 5. Method Body - {}
	 * 6. Exception - What this method throws in risk situation
	 */
	public TestMethods() {
		System.out.println("TestMethods Constructor");
	}
	
	
	
	
	// Write a Method to calculate taxes on bill amount
	/*
	 * Six Components of Method
	 * 1. Access Modifier
	 * 2. Return type - type of output generated in method - use return statement 
	 * 3. Method Name - rules exactly same as Variable names
	 * 4. Parameters / Arguments - Input to the method passed in ()
	 * 5. Method Body - {}
	 * 6. Exception - What this method throws in risk situation
	 */
	// Print the tax and return it
	
	public double calculateTaxes(int billAmount) {
		double taxes = 0;
		if(billAmount > 0) {
			taxes = billAmount*0.1236;
		}
		System.out.println("Tax Calculated as " + taxes);
		return taxes;
	}
	// Add same methods taking state name as parameter
	// Overloading - same method name - different argument
	// type - should be different OR
	// Number - should be different
	// Return type is not a part of method signature 
	public double calculateTaxes(int billAmount, String state) {
		double taxes = 0;
		if(state.equalsIgnoreCase("Georgia")){
			taxes = billAmount*0.1236;
		}else {
			taxes = billAmount*0.111;
		}
		System.out.println("Tax Calculated as for state "+ state + "  " + taxes);
		return taxes;
	}
	
	public double calculateTaxes(String state) {
		double taxes = 0;
		int billAmount = 1;
		if(state.equalsIgnoreCase("Georgia")){
			taxes = billAmount*0.1236;
		}else {
			taxes = billAmount*0.111;
		}
		System.out.println("Tax Calculated as for state "+ state + "  " + taxes);
		return taxes;
	}
	
	
	// Empty return is valid in Java
	public void printLogo() {
		System.out.println("More Saving, More Doing");
		return;
	}
	
	
	// Write a Class Billing - which should be instantiated with StateName 
}
