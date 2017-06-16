package com.learn.test;

public class ThreadMain {

	public static void main(String[] args) throws Exception {
		
		String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start...");
        
		Thread t1 = new Thread(new ThreadOne());
		Thread t2 = new Thread(new ThreadTwo());
		
		t1.start();
		t1.join();//等待此线程执行完毕后，接着执行其他的线程
		t2.start();
		t2.join();//等待此线程执行完毕后，接着执行其他的线程
		
		System.out.println(threadName + " end...");
	}
}
