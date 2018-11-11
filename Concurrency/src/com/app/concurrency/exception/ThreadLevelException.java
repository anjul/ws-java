package com.app.concurrency.exception;

public class ThreadLevelException {

	public static void main(String[] args) {
		
		Thread t1 =  new Thread( new Runnable() {
			
			@Override
			public void run() {
				throw new RuntimeException("I'm runtime excpetion");
				
			}
		});
		
		t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				
				System.out.println(t.getName()+" //// "+e.getMessage());
			}
		});
		t1.start();

	}

}
