package com.h2kinfosys.learnJava.day09;

public class TestException {

	public static void main(String[] args) {
		// Exception Handling
		// 1. Try Catch - Handle an Exception
		// 2. Finally
		// 3. throwing exception
		// 4. Custom Exception
		
		int[] sampleArray = {0,1,2,3,4};
		
		/*
		 * try{
		 * 	risky code - which might throw exception
		 * }catch(Exception exe){
		 * 	block of code executes when exception occurs
		 * }finally{
		 * 	this block will be always executed regardless of error or not
		 * }
		 * Any number of Catch Blocks are allowed
		 * Catch Rule - Specific / Child First, generic / Parent later
		 */
		try {
			//int newInt = Integer.parseInt("ABC");
			float div = sampleArray[3] / sampleArray[1];
			System.out.println(div);
			System.out.println(sampleArray[4]);
		}catch(ArrayIndexOutOfBoundsException aex) {
			System.out.println("There was an Exception " + aex.getMessage());
		}catch(ArithmeticException arEx) {
			System.out.println("Arithmatic Exception :: " + arEx.getMessage());
		}catch(Exception ex) {
			System.out.println("Any other type of Exception " + ex.getMessage());
		}finally {
			System.out.println("I am done with Risky content");
		}
		System.out.println(sampleArray[0] + sampleArray[1]);
		System.out.println("Some More statements");
		
	}

}
