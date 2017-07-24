package com.app.concurrency.locks.reenterantlock;
/**
 * In this example we are observing the benefit of 'ReentrantLock'
 * ReentrantLock is the alternate way of doing 'Synchronization' blocks
 * @author as91623
 *
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ReenterantLockApp {

	private static Lock lock = new ReentrantLock();
	public static int counter = 0;

	//Try commenting out the lock and unlock statement in below method you'll see the difference
	public static void increment(){

		lock.lock();
		
		for(int index=0;index<10000;index++)
			counter++;
		
		lock.unlock(); 	// Benefit of using ReentrantLock is it can be unlocked from any method thats the only benefit
	}

	public static void main(String[] args) {


		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				increment();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				increment();
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

		System.out.print("Counter is = "+counter);
	}

}
