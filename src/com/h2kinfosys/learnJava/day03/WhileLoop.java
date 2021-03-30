package com.h2kinfosys.learnJava.day03;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * counter < 10 
		 * while (condition){
		 * 		condition is true
		 * 		this block executes
		 * 		condition evaluator
		 * }
		 * jumps out - if condition is false
		 * Total  - 1 to 10 
		 */
		int counter = 1;
		int total = 0;
		while(counter <= 10) {
			total = total + counter;
			System.out.println("Counter Value now " + counter);
			counter++; // counter = counter + 1
		}
		System.out.println("Jump out of Loop with Counter " + counter);
		System.out.println("Total " + total);
		
		// do..while - atleast once regardless of condition
		/*
		 * do{
		 * 		block of code 
		 * }while(condition);
		 */
		counter = 99;
		total = 0;
		do {
			total = total + counter;
			System.out.println("Counter Value now " + counter);
			counter++; // counter = counter + 1
		}while(counter <= 10);
		
		System.out.println("Jump out of do-while Loop with Counter " + counter);
		System.out.println("Total " + total);
	}

}
