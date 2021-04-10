package com.h2kinfosys.learnJava.day07;

public class Employee implements Reachable, LeadershipCapability{

	@Override
	public void validateAddress(String address) {
		System.out.println("Using Google Maps API " + address);
		System.out.println(companyName);
		Reachable.processSkillBasedAllocation("JAVA");
	}
	


	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.validateAddress("Something");
		emp.processEmployeeBenefits();
		emp.leadershipTraining(false);
		
		Manager manager = new Manager();
		manager.processEmployeeBenefits();
	}




	@Override
	public void leadershipTraining(boolean isTrainingDone) {
		if(isTrainingDone) {
			System.out.println("Consider for Team Leader Role");
		}else {
			System.out.println("Consider for next Training batch");
		}
		
	}

}
