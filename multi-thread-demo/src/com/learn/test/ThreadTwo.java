package com.learn.test;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName +" start...");
		
		System.out.println(threadName+" end.");
	}

}
