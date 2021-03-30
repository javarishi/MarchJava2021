package com.h2kinfosys.learnJava.day03;

public class ForLoop {

	public static void main(String[] args) {
		// intialize, condition, update 
		// known set of iteration
		/*
		 *  for(initialization, condition, update){
		 *  	block of code till condition is true
		 *  }
		 */
		int total = 0;
		for(int counter = 1; counter <= 10; counter++) {
			total = total + counter;
			System.out.println("Counter Value now " + counter);
		}
		System.out.println("Total " + total);

	}

}
