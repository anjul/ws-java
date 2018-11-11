/**
 * 
 */
package com.app.concurrency.sequentialThreadExecution;

/**
 * @author Anjul
 * Purpose: This class is a resource class whose object will be shared across the all threads to complete their task.
 */
public class Resource {

	public volatile int flag = 1;
}
