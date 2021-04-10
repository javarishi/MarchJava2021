package com.h2kinfosys.learnJava.day07;

public class Manager extends Employee  {
	
	@Override
	public void processEmployeeBenefits() {
		super.processEmployeeBenefits();
		System.out.println("Additional Vacations and Medical");
	}

	
	public static void main(String[] args) {
		Employee manager = new Manager();
		Reachable newManager = new Manager();
		// Visibility = RefereceType
		// Execution = Instance
		newManager.processEmployeeBenefits();
		
		
	}
	
	
	

}
