package com.h2kinfosys.learnJava.day01;

import com.h2kinfosys.learnJava.day07.Reachable;

// class - is keyword to create Class
public class Customer {

	// Double slash is single line comment
	/* 
	 * This is Multi line comment in Java
	 * As many lines you want
	 */
	// Variables - fields
	// functions - methods
	// Type - Size
	// Integer - Numbers 
	
	
	
	public static void main(String[] args) {
		// DataType variableName = value;
		byte byteData = -128;
		Byte byteObj = -127;
		System.out.println(Byte.MIN_VALUE);
		
		short shortData = 32000;
		int intData = 999999999;
		long longData = 99999999999L;
		
		// Decimal Point 
		float floatData= 3324.32432f;
		double doubleData = 432234.234324d;
		
		// Character 
		char singleChara = '@';
		
		// Boolean
		boolean flag = false;
		
		// customer name
		String customerName = "David Burrow";
		String null_str = null;
		String space_string = " ";
		String empty_string = "";
		
		System.out.println(Reachable.companyName);
	}
	
}
