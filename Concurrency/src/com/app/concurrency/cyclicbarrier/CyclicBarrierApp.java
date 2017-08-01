package com.app.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierApp {

	public static void main(String[] args){

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {

			@Override
			public void run() {
				System.out.println("We are able to use this main task!!");
			}
		});	
		
		for(int index=0;index<5;index++){
			executorService.execute(new Worker(index+1, cyclicBarrier));
		}
		
		executorService.shutdown();
	}
}
