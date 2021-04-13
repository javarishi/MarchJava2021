package com.h2kinfosys.learnJava.day08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// Generics for List - String
		// ArrayList<String> shoppingCart = new ArrayList<String>();
		LinkedList<String> shoppingCart = new LinkedList<String>();
		// Adding an elemnet
		shoppingCart.add("Milk");
		shoppingCart.add("Potatos");
		shoppingCart.add("Potatos");
		shoppingCart.add("Sugar");
		// How to get an element
		System.out.println(shoppingCart.get(0));
		// inserting element at particular position - random access 
		shoppingCart.add(3, "Canned Beans");
		System.out.println(shoppingCart);
		// Iteration 
		for(String eachItem : shoppingCart) {
			System.out.println(eachItem);
		}
		// Sublist 
		List<String> sublist =  shoppingCart.subList(1, 4);
		System.out.println("My Sublist is " + sublist);
		
		// Checking if element exists
		if(shoppingCart.contains("Sugar")) {
			System.out.println("Sugar is added already");
		}
		// Sorting  - NULL is natural order
		shoppingCart.sort(null);
		System.out.println("Post Sorting :: " + shoppingCart);
		// remove
		shoppingCart.remove("Sugar");
		System.out.println(shoppingCart);
		// NUmber of elements
		System.out.println("Number of elements:: " + shoppingCart.size());
		// Clear 
		shoppingCart.clear();
		System.out.println(shoppingCart);
		// checking if empty
		if(shoppingCart.isEmpty()) {
			System.out.println("Yes Collection is Empty");
		}
		
		

	}

}
