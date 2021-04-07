package com.h2kinfosys.learnJava.day04;

public class TestPackageAccess {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		System.out.println(access.publicString);
		// The field AccessModifiers.privateString is not visible
		// System.out.println(access.privateString);
		System.out.println(access.defaultString);
		System.out.println(access.protectedString);
	}

}
