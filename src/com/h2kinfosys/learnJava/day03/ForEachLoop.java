package com.h2kinfosys.learnJava.day03;

public class ForEachLoop {

	public static void main(String[] args) {
		// Arrays - Collection of multiple values
		int marks1 = 20;
		int marks2 = 19;
		int[] marks = {20,19,18,17,18,20};
		System.out.println(marks);
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		
		int totalMarks = 0;
		for(int eachSub : marks) {
			System.out.println("Currently adding " + eachSub);
			totalMarks = totalMarks + eachSub;
		}
		System.out.println("Total Marks " + totalMarks);

	}

}
