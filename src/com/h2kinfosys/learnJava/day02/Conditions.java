package com.h2kinfosys.learnJava.day02;

public class Conditions {

	/*
	 * 2 numbers - find the biggest
	 * if condition{
	 * 		executed when condition is true
	 * }else{
	 * 		executed when condition is false
	 * }
	 */
	
	public static void main(String[] args) {
		// Taking action with comparison - boolean result 
		// Flow of program - control by - result - Controls 
		int varOne = 100;
		int varTwo = 200;

		if (varOne > varTwo) {
			System.out.println(varOne + " is Bigger Number");
		}else {
			System.out.println(varTwo + " is Bigger Number");
		}
		
		System.out.println("Done!");
	}

}
