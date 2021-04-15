package com.h2kinfosys.learnJava.day09;

public class TestStore {

	public static void main(String[] args) {
		// Bubbling of exception 
		TestStore test = new TestStore();
		try {
			test.getAgeValidationMessage("21AAA");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

	public void getAgeValidationMessage(String age) throws Exception {
		WalgreensStore store = new WalgreensStore();
		store.checkAge(age);
	}
}
