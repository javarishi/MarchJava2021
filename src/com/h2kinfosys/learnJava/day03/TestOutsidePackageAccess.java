package com.h2kinfosys.learnJava.day03;

import com.h2kinfosys.learnJava.day04.AccessModifiers;

public class TestOutsidePackageAccess {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
	// Only Public members are accessible outside the package
		System.out.println(access.publicString);
	
	//	System.out.println(access.privateString);
	//	System.out.println(access.defaultString);
	//	System.out.println(access.protectedString);
	}

}
