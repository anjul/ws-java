package com.app.concurrency.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


enum Downloader{
	
	INSTANCE;
	int permits = 5;	// 5 Threads can be executed at the same time
	boolean fair = true;
	private Semaphore semaphore= new Semaphore(permits, fair);

	public void downloadData(){

		try{
			semaphore.acquire();
			donwload();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally {
			semaphore.release();
		}
	}

	private void donwload(){
		
		System.out.println("Downloading data from the Internet");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}


public class AppSemaphores {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for(int index=0;index<12;index++){
			
			executorService.execute(new Runnable() {
				public void run() {
					Downloader.INSTANCE.downloadData();
				}
			});
		}
	}

}
