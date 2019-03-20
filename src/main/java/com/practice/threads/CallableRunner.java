package com.practice.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		try {

			if (this.name.equals("Snapdeal")) {
				throw new RuntimeException("Snapdeal is not supported!");

			}
		} catch (Exception e) {
			return null;
		}
		return "Welcome to " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);
		// Future<String> will promise that we will get the results
		Future<String> welcomeFuture = executorService.submit(new CallableTask("Google"));

		System.out.println("\nNew Callable Executed..");

		// get() waits till we get the result from the thread
		System.out.println(welcomeFuture.get());

		System.out.println("\n Main completed");

		executorService.shutdown();
	}

}
