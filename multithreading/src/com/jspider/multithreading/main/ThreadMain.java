package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread3;

public class ThreadMain {
public static void main(String[] args) {
//	MyThread1 myThread1=new MyThread1();
//	myThread1.start();
	
//	MyThread2 myThread2=new MyThread2();
//	Thread thread=new Thread(myThread2);
//	thread.start();	
	
//	MyThread1 myThread1=new MyThread1();
//	myThread1.setName("Thread-1");
//	myThread1.setPriority(9);
//	MyThread2 myThread2=new MyThread2();
//	Thread thread=new Thread(myThread2);
//	thread.setName("Thread-2");
//	thread.setPriority(10);
//	
//	myThread1.start();
//	thread.start();
	MyThread3 myThread3=new MyThread3();
	myThread3.start();
	
}
}
