package com.app.concurrency.without.synchornization;

public class ConcurrencyApp {

	private static int counter = 0;

	public static void increment() {
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
