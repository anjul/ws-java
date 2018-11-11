package com.app.concurrency.sequentialThreadExecution;

public class Main {

	public static void main(String[] args) {
		
		Resource resource = new Resource();
		
		//Thread thread;
		
		ThreadA threadA = new ThreadA(resource); new Thread(threadA).start();
		ThreadB threadB = new ThreadB(resource); new Thread(threadB).start();
		ThreadC threadC = new ThreadC(resource); new Thread(threadC).start();
		
//		threadA.start();
//		threadB.start();
//		threadC.start();

	}

}
