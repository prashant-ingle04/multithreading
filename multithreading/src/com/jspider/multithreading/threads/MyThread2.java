package com.jspider.multithreading.threads;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
			System.out.println("Name of the thread is:"+Thread.currentThread().getName());
			System.out.println("Priority of the thread is "+Thread.currentThread().getPriority());
		
	}

}
