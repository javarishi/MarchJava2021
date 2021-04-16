package com.h2kinfosys.learnJava.day010;

public class ThreadTesting {

	public static void main(String[] args) throws InterruptedException {
		// Thread class helps you to create Threads
		MyTask task = new MyTask();
		Thread t1 = new Thread(task);
		t1.setName("Processor 1");
		Thread t2 = new Thread(task);
		t2.setName("Processor 2");
		Thread t3 = new Thread(task);
		t3.setName("Daemon");
		t3.setDaemon(true);
		
		// Never trust sequence of threads - regardless of Priority
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(1000);
		System.out.println("Processing is Complete : Sending email to Professor");
	}	

}
