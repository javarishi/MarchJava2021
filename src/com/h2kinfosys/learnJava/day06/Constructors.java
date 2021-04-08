package com.h2kinfosys.learnJava.day06;

public class Constructors {
	
	// How can I call one Constructor from Another?
	private String sampleString;
	
	public Constructors() {
		System.out.println("Constructor 0");
	}
	
	public Constructors(String sample) {
		this();
		this.sampleString = sample;
		System.out.println("Constructor 1 " + sample);
	}
	
	// this always represents current object 
	// this() call should always be first statement of Constructor
	// this. <-- ref of current object
	public Constructors(String sample, int anotherSample) {
		this(sample);
		System.out.println("Constructor 2 " + anotherSample);
	}
	
	
	// How can I use methods and variables from one class in another
	// Inheritance - Customer - Preferred Class
	
	// How is constructor call sequence - what is super
	// super - ref of parent class object super() - super.member
	
	// What is method overriding - rules of overriding
	
}
