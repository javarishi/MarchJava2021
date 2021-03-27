package com.h2kinfosys.learnJava.day02;

public class ComparisonInCondition {

	/*
	 * 3 numbers - find biggest
	 */
	public static void main(String[] args) {
		int varOne = 1000;
		int varTwo = 2000;
		int varThree = 3000;
		
		/*
		 * 1. varOne to varTwo and varThree 
		 * 2. if true - varOne is Biggest number
		 * 3. compare varTwo and varThree
		 */

		if ((varOne > varTwo) && (varOne > varThree)) {
			System.out.println(varOne + " is Biggest Number");
		}else if (varTwo > varThree) {
			System.out.println(varTwo + " is Biggest Number");	
		}else {
			System.out.println(varThree + " is Biggest Number");
		}
		
		// HW - 4 Numbers - no duplicates - Comparison code - find the biggest
	}

}
