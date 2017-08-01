package com.app.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Countdown Latches are good for to 
 *'Synchronize one or more tasks by forcing them to wait for the 
 * completion of a set of a operations being performed by other task.'
 * Use Case for Countdown latches:: 
 * 					If you want to trigger or perform some special task when 'N' number of users downloaded an image, 
 * 					in that case we can use CountdownLatches'.
 * 					>> In countdown latch, counter can't be reset
 * 					>> It is good for only one shot events
 * @author Anjul
 *
 */

public class CountdownLatchApp {


	public static void main(String[] args) {

		int count = 5; //the number of times countDown must be invoked before threads can pass through await
		Worker worker;

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		CountDownLatch countDownLatch = new CountDownLatch(count);

		for(int index=0; index<count;index++){

			worker = new Worker(index+1, countDownLatch);	// Instantiating new worker thread each time
			executorService.execute(worker);
		}
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("All the prerequisites are down");
		executorService.shutdown();

	}

}
