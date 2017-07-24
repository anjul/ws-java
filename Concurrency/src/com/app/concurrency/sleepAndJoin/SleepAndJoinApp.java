package com.app.concurrency.sleepAndJoin;

/***
 * 
 *	@author Anjul
 *	Demo of Sleep and Join methods of Thread class
 */
class Runner1 implements Runnable{

	@Override
	public void run(){

		for(int index=0; index < 10;index++){
			
			System.out.println("Runner1 : "+index);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runner2 implements Runnable{

	@Override
	public void run(){
		
		for(int index=0; index < 10;index++){
			System.out.println("Runner2 : "+index);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepAndJoinApp {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runner1());
		Thread thread2 = new Thread(new Runner2());
		
		thread1.start();
		thread2.start();
		
		try{
			thread1.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Task is completed");
	}

}
