package com.h2kinfosys.learnJava.day010;

import java.util.Calendar;

// Task is created with Runnable
public class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Logic for Individual Student % calculation " + Thread.currentThread().getName());
		for(int i=0; i < 10; i++) {
			System.out.println(generateKey() + " Getting Marks for Subject " + i + " by " + Thread.currentThread().getName());
			 try { 
				 Thread.sleep(1); 
				 } catch 
			 (InterruptedException e) {
			 e.printStackTrace(); }
			
		}
	}

	
	public String generateKey() {
		System.out.println("Key Generator");
		String key = null;
		synchronized (this) {
			key = "KEY_"+System.currentTimeMillis();
		}			
		return key;
	}

}
