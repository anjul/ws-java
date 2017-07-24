package com.examples.locks.reenterantlock.producerAndConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/**
 * This examples demonstrate the usage of ReentrantLock with Condition on 'Producer Consumer'
 * Similar to wait and notify methods
 * @author as91623
 *
 */
class Worker{

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void producer() throws InterruptedException{

		lock.lock();
		System.out.println("I'm in producer method");
		condition.await();			//Similar to wait() method
		System.out.println("Again I'm in producer method");
		lock.unlock();
	}

	public void consumer() throws InterruptedException{

		lock.lock();
		Thread.sleep(2000);
		System.out.println("I'm in Consumer method");
		condition.signal();		//Similar to notify() method
		lock.unlock();
	}
}

public class App5 {

	public static void main(String[] args) {

		Worker worker = new Worker();
		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				try {
					worker.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				try {
					worker.consumer();
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
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
