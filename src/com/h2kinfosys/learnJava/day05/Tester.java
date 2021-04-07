package com.h2kinfosys.learnJava.day05;

public class Tester {

	public static void main(String[] args) {
		// ClassName instaceName = new ClassName()
		// ClassName instanceName = new Constructor()
		TestMethods test = new TestMethods();
		double tax_amt = test.calculateTaxes(200);
		System.out.println("Tax Amount received " + tax_amt);
		test.printLogo();
		// Constructor = Method - which has className as Method name
		// Compiler gives No-arg constructor for free - till u don't have your own
		Billing bill = new Billing("Georgia");
	}

}
