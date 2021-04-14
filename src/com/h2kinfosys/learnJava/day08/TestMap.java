package com.h2kinfosys.learnJava.day08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// Map Interface
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		HashMap<Integer, String> students_otherClass = new HashMap<Integer, String>();
		
		students_otherClass.put(201, "Alex");
		students_otherClass.put(202, "Mandy");
		// Add a Value in Map
		students.put(101, "David Burrow");
		students.put(102, "Ryan Gloen");
		students.put(104, "Rishi");
		students.put(105, "Nayan");
		students.put(106, "Nuha");
		// Same value different key
		students.put(103, "David Burrow");
		// Same key different value
		students.put(101, "Neil Armstrong");
		System.out.println(students);
		
		// remove 
		String beforeRemoval = students.remove(103);
		System.out.println("Before removal value " + beforeRemoval);
		System.out.println(students);
		// getting - not removing just accessing
		String student101 =students.get(101);
		System.out.println("Accessing Student 101 " + student101);
		System.out.println(students);
		// Contains
		if(students.containsKey(101)) {
			System.out.println("Roll No 101 is present");
		}
		if(students.containsValue("David Burrow")) {
			System.out.println("David Burrow is present");
		}
		
		Set<Integer> keySet = students.keySet();
		for(Integer eachKey: keySet) {
			System.out.println("Key :: " + eachKey + " Value " + students.get(eachKey));
		}
		
		Collection<String> values = students.values();
		for(String eachValue : values) {
			System.out.println(eachValue);
		}
		
		students.putAll(students_otherClass);
		
		// Size
		System.out.println(students.size());
		
		
		// Clear
		students.clear();
		System.out.println(students);
		
		
	}

}
