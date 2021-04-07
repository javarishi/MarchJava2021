package com.h2kinfosys.learnJava.day05;

public class Billing {
	
	public Billing(String stateName) {
		System.out.println("This is Billing " + stateName);
	}
	
	public Billing(String stateName,  String county) {
		System.out.println("This is Billing " + county);
	}

	public Billing(String stateName,  String county, String cityname) {
		System.out.println("This is Billing " + cityname);
	}
}
