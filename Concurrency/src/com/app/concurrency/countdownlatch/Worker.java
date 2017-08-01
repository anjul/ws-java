package com.app.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

	private int id;
	private CountDownLatch countDownLatch;
	
	public Worker(int _id, CountDownLatch _countDownLatch) {
		super();
		
		this.id = _id;
		this.countDownLatch = _countDownLatch;
	}
	
	public void run(){
		doWork();
		countDownLatch.countDown();
	}
	
	private void doWork(){
		
		System.out.println("Thread with id "+ this.id +" starts working...");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
