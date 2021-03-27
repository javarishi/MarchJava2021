package com.h2kinfosys.learnJava.day02;

import java.util.Calendar;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// Trigger Store Open Batch
		/*
		 * Sunday , Sat  - 7:30
		 * Mon, Fri - 7
		 * Tue - 8
		 * Wed - 8:30
		 * Thru - 9
		 *  
		 */
		
		int day_of_week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("Today is " + day_of_week);
		System.out.println("Today is " + Calendar.getInstance().getTime());
		switch(day_of_week){
		
		case 1:
		case 6:{
				System.out.println("Store Batch Trigger at 7:30 AM");
				break;
			}
		case 2:
		case 7: {
				System.out.println("Store Batch Trigger at 7:00 AM");
				break;
			}
		case 3: {
				System.out.println("Store Batch Trigger at 8:00 AM");
				break;
			}
		case 4: {
				System.out.println("Store Batch Trigger at 8:30 AM");
				break;
			}
		case 5: {
				System.out.println("Store Batch Trigger at 9:00 AM");
				break;
			}
		default:{
				System.out.println("Store Batch Trigger at 8:30 AM");
				break;
			}
		
		}
		System.out.println("Store Batch Triggered , Thank You");

	}

}
