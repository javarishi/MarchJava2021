package com.h2kinfosys.learnJava.day08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// HashSet , TreeSet
		// Try and check order of insertion with LinkedHashSet
		HashSet<String> shoppingCart = new HashSet<String>();
		// Adding an elemnet
		System.out.println(shoppingCart.add("Milk"));
		System.out.println(shoppingCart.add("Potatos"));
		System.out.println(shoppingCart.add("Potatos"));
		System.out.println(shoppingCart.add("Sugar"));
		System.out.println(shoppingCart);
		
		TreeSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("A");
		sortedSet.add("Z");
		sortedSet.add("E");
		sortedSet.add("G");
		sortedSet.add("H");
		System.out.println(sortedSet);
		// Contains
		
		
		// Size
		
		
		// For (String eachItem : set)
		
		
		
		// clear
		
		
		// remove("element")
		
		
		
		
		
	}

}
