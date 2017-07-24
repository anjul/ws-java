package com.examples.with.synchornization.producerAndConsumer;

import java.util.ArrayList;
import java.util.List;

class Processor {

	private List<Integer> list = new ArrayList<>();
	private final int LIMIT = 5;
	private final int BOTTOM = 0;
	private final Object lock = new Object();
	private int counter = 0;
	
	public void producer() throws InterruptedException{

		synchronized(lock){
			
			while(true){
				if(list.size() == LIMIT){
					System.out.println("Waiting for removing the items from the list...");
					lock.wait();
				}else{
					System.out.println("Adding : "+counter);
					list.add(counter);
					counter++;
					lock.notify();
					
				}
				Thread.sleep(500);	// small pause to observe the task in console otherwise execution will be very fast to observe
			}
		}
	}

	public void consumer() throws InterruptedException{

		synchronized(lock){
			
			while(true){
				if(list.size() == BOTTOM){
					System.out.println("Waiting for adding the items to the list...");
					lock.wait();
				}else{
					--counter;
					list.remove(counter);
					System.out.println("Removed : "+ counter);
					lock.notify();
				}
				Thread.sleep(500);	// small pause to observe the task in console otherwise execution will be very fast to observe
			}
		}
	}
}

public class App3 {

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
		
		//Below Join operation is necessary so that main thread of this entire program must wait before both thread finishes theri task.
		try{
			thread1.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
