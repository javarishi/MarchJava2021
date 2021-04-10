package com.h2kinfosys.learnJava.day07;

public interface Reachable extends Mappable{
	
	// Variables in Interface are always public static final  
	String companyName = "The Home Depot Inc";
	
	// by default methods in interface are abstract public
	// Access Modifier for abstract methods in interface is always public
	void validateAddress(String address);
	
	// default methods are not enforced on implementor
	default void processEmployeeBenefits() {
		System.out.println("Basic Privilages and Package Benefits");
	}

	static void processSkillBasedAllocation(String skill) {
		System.out.println("Project Allocated with " + skill);
	}
}
