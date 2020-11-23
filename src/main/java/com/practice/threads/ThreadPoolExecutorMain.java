package com.practice.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorMain {
	public static void main(String args[]) {
		// Getting instance of ThreadPoolExecutor using Executors.newFixedThreadPool
		// factory method
//		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
//		for (int i = 0; i < 10; i++) {
//			FetchDataFromFile fdff = new FetchDataFromFile("File " + i);
//			System.out.println("A new file has been added to read : " + fdff.getFileName());
//			// Submitting task to executor
//			threadPoolExecutor.execute(fdff);
//		}
//		threadPoolExecutor.shutdown();

		// Wait queue is used to store waiting task
		BlockingQueue queue = new LinkedBlockingQueue(4);

		// Thread factory to create new threads
		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		// Rejection handler in case task get rejected
		RejectTaskHandler rth = new RejectTaskHandler();
		// ThreadPoolExecutor constructor to create its instance
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 10L, TimeUnit.MILLISECONDS, queue,
				threadFactory, rth);
		for (int i = 1; i <= 10; i++) {
			FetchDataFromFile fdff = new FetchDataFromFile("File " + i);
			System.out.println("A new file has been added to read : " + fdff.getFileName());
			// Submitting task to executor
			threadPoolExecutor.execute(fdff);
		}
		threadPoolExecutor.shutdown();
	}
}

class FetchDataFromFile implements Runnable {

	private final String fileName;

	public FetchDataFromFile(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void run() {
		try {
			System.out.println("Fetching data from " + fileName + " by " + Thread.currentThread().getName());
			Thread.sleep(5000); // Reading file
			System.out.println("Read file successfully: " + fileName + " by " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getFileName() {
		return fileName;
	}
}

class RejectTaskHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		FetchDataFromFile ffdf = (FetchDataFromFile) r;
		System.out.println("Sorry!! We won't be able to read :" + ffdf.getFileName());
	}
}