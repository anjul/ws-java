package com.app.concurrency.cyclicbarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable {

	private int id;
	private Random random;
	private CyclicBarrier cyclicBarrier;
	
	public Worker(int _id,CyclicBarrier _cyclicBarrier){
		this.id = _id;
		this.cyclicBarrier = _cyclicBarrier;
		random = new Random();
	}
	
	
	public void run(){
		doWork();
	}

	private void doWork() {
		System.out.println("Thread with id ="+id+" Starts the work");
		
		try{
			Thread.sleep(random.nextInt(3000));
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread with id ="+id+" Finishes the work");
		
		try{
			cyclicBarrier.await();
			System.out.println("After await!");
		}catch(InterruptedException | BrokenBarrierException e){
			e.printStackTrace();
		}
	}
	
	public String toString(){
		return ""+this.id;
	}
}
