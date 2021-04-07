package com.h2kinfosys.learnJava.day04;

public class AccessModifiers {
	/*
	 * public - accessible to everyone
	 * private - accessible to no-one but same class
	 * package - default access - doesn't have a keyword 
	 * protected - package + children
	 */
	
	public String publicString = "Public String";
	private String privateString = "private String";
	String defaultString = "Default String";
	protected String protectedString = "protected String";
	
	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		System.out.println(access.publicString);
		System.out.println(access.privateString);
		System.out.println(access.defaultString);
		System.out.println(access.protectedString);
	}

}
