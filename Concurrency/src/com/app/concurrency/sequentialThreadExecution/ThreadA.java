package com.app.concurrency.sequentialThreadExecution;

public class ThreadA implements Runnable {

	Resource resource;

	ThreadA(Resource _resource) {
		this.resource = _resource;
	}

	@Override
	public void run() {

		try{
			synchronized(this.resource){
				
				for(int i=0;i<100;i++){
					
					while(this.resource.flag != 1){
						resource.wait();
					}
					
					System.out.println("A ");
					Thread.sleep(1000);
					resource.flag = 2;
					resource.notifyAll();
				}
			}
		}catch(Exception exception){
			System.out.println("Exception 1: " + exception.getMessage());
		}
	}
}
