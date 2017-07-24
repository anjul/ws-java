package com.app.concurrency.with.synchornization.waitAndNotify;

class Processor {

	public void producer() throws InterruptedException{

		synchronized(this){
			System.out.println("I'm in producer method");
			wait();	//This wait() method will put next statement on hold/pause until it receive a signal or notification from notify method 
			System.out.println("Again I'm in producer method");

		}
	}

	public void consumer() throws InterruptedException{

		Thread.sleep(1000);	// Asking thread to pause/sleep for 1sec

		synchronized(this){
			System.out.println("I'm in consumer method");
			notify();	// This notify() will tell to producer method which is on wait right now to resume its work.
		}
	}
}

public class WaitAndNotifyApp {

	public static void main(String[] args) {

		Processor processor = new Processor();

		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				try {
					processor.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});


		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
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

}
