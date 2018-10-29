package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Creating a thread pool - specify the number of the threads to be
		// executed in parallel
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		List<CallableTask> tasks = new ArrayList<>();
		tasks.add(new CallableTask("Amazon"));
		tasks.add(new CallableTask("Flipkart"));
		tasks.add(new CallableTask("Snapdeal"));
		tasks.add(new CallableTask("Myntra"));

		// Get() method Waits till we get the result from all the threads
		// List<Future<String>> results = executorService.invokeAll(tasks);

		// for (Future<String> result : results) {
		// System.out.println(result.get());
		// }

		// Get() method Waits till we get the result from any one of the threads
		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();

	}

}
