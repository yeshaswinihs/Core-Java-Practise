package com.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorFramework {

	public static void main(String[] args) {
//		Executor’s newFixedThreadPool factory method :
//			This method returns ThreadPoolExecutor whose maximum size(let’s say n threads) 
//			is fixed.If all n threads are busy performing the task and additional tasks 
//			are submitted, then they will have to be in the queue until a thread is available.
		ExecutorService es = Executors.newFixedThreadPool(3);

//		Executor’s newCachedThreadPool  factory method :
//			This method returns an unbounded thread pool. 
//			It sets maximum pool size to Integer.Max and it will create new threads depending on demand. 
//			If demand decreases, it will tear down threads if threads are idle for more than 1 min

//		for (int i = 1; i <= 6; i++) {
//			LoopTask loopTask = new LoopTask("LoopTask " + i);
//			es.submit(loopTask);
//		}
//		es.shutdown();

		// Getting instance of ThreadPoolExecutor using Executors.newCachedThreadPool
		// factory method
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		for (int i = 1; i <= 10; i++) {
			FetchDataFromFile fdff = new FetchDataFromFile("File :" + i);
			System.out.println("A new file has been added to read : " + fdff.getFileName());
			threadPoolExecutor.execute(fdff);
		}
		threadPoolExecutor.shutdown();
	}

}

class LoopTask implements Runnable {

	private String loopTaskName;

	public LoopTask(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
	}

	@Override
	public void run() {
		System.out.println("Starting " + loopTaskName);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Executing " + loopTaskName + " with " + Thread.currentThread().getName() + "====" + i);
		}
		System.out.println("Ending " + loopTaskName);
	}
}
