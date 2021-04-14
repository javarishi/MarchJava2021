package com.h2kinfosys.learnJava.day08;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {
		Deque<String> testDeque = new ArrayDeque<String>();
		testDeque.addFirst("First");
		testDeque.offer("offer");
		testDeque.addLast("Last");
		System.out.println(testDeque);
		

	}

}
