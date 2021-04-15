package com.h2kinfosys.learnJava.day09;

public class WalgreensStore {
	
	public void checkAge(String age) throws Exception {
		if(age != null && age.trim().length() > 0) {
			int int_age = 0;
			try {
				int_age = Integer.parseInt(age);
			}catch(NumberFormatException nex) {
				throw new Exception(nex.getMessage());
			}
			if(int_age >= 18) {
				System.out.println("Customer Can Buy Alcohol");
			}else {
				// throw new Exception
				throw new InsufficientAgeException("Customer Age Insufficient");
			}
		}else {
			throw new Exception("Invalid Exception");
		}
		
		
	}

}
