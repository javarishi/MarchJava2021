package com.h2kinfosys.learnJava.day08;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		Queue<String> emptyqueue = new PriorityQueue<String>();
		// add an element
		queue.offer("101");
		queue.offer("102");
		queue.offer("103");
		
		// getting an element 
		// Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(emptyqueue.peek());
		// element throws exception if queue is empty
		//System.out.println(emptyqueue.element());
		System.out.println(emptyqueue);
		
		// Retrieves and removes
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		
		System.out.println(emptyqueue.poll());
		System.out.println(emptyqueue);
		//System.out.println(emptyqueue.remove());
		//System.out.println(emptyqueue);
		
		
		
	}

}
