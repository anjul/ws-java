package com.app.concurrency.sequentialThreadExecution;

public class ThreadC implements Runnable {

	Resource resource;
	
	ThreadC(Resource _resource){
		this.resource = _resource;
	}
	
	@Override
	public void run() {
		
		try{
			synchronized (this.resource) {
				
				for(int i=0; i< 100; i++){
					
					while(this.resource.flag != 3){
						resource.wait();
					}
					
					System.out.println("C ");
					Thread.sleep(1000);
					resource.flag  = 1;
					resource.notifyAll();
				}
			}
		}catch(Exception exception){
			System.out.println("Exception 1: " + exception.getMessage());
		}
	}
}