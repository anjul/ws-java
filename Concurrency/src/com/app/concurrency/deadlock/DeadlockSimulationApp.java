package com.app.concurrency.deadlock;

class Process{


}

public class DeadlockSimulationApp {

	final static String resource1  = "Anjul";
	final static String resource2 = "Sharma";

	public static void main(String[] args){

		Thread thread1 = new Thread(new Runnable() {

			public void run() {

				synchronized(resource1){

					System.out.println("Thread1 has locked the resource: "+resource1);

					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}

					synchronized(resource2){
						System.out.println("Thread1 has locked the resource: "+resource2);
					}
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {

				synchronized(resource2){

					System.out.println("Thread2 has locked the resource: "+resource2);

					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}

					synchronized(resource1){
						System.out.println("Thread2 has locked the resource: "+resource1);
					}
				}

			}
		});

		thread1.start();
		thread2.start();

		try{
			thread1.join();
			thread2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		System.out.println("Main program execution terminated!");
	}
}
