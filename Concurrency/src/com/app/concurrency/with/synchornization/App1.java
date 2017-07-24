package com.examples.with.synchornization;

public class App1 {

	private static int counter = 0;

	//Declared increment method as synchronized so that both threads should not access this method at the same time
	public static synchronized void increment() {
		++counter;
	}
	
	public static void process(){

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int index=0; index<100; ++index){
					increment();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for(int index=0; index<100; ++index){
					increment();
				}
			}
		});

		thread1.start();
		thread2.start();

		try{

			thread1.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		process();
		System.out.println("Value of increment is = "+counter);

	}

}
