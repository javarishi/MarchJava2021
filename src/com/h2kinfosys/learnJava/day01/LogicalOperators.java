package com.h2kinfosys.learnJava.day01;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical Operators  - Booleans
		/* AND Truth Table R = S1 & S2
		 * S1	S2		R
		 * T	T		T
		 * T	F		F
		 * F	T		F
		 * F	F		F		
		 */
		boolean s1 = false;
		boolean s2 = false;
		boolean r = s1 & s2;
		System.out.println(s1 + " & " + s2 + " = " + r);
		
		/* OR Truth Table R = S1 | S2
		 * S1	S2		R
		 * T	T		T
		 * T	F		T
		 * F	T		T
		 * F	F		F		
		 */
		r = s1 | s2;
		System.out.println(s1 + " | " + s2 + " = " + r);
		
		/*
		 * NOT - !
		 * S1 	!S1
		 * T	F
		 * F	T
		 */
		System.out.println("Not r " + !r);
	}

}
