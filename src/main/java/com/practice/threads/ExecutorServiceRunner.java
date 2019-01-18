package com.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("\nTask " + number + "started..");
		for (int i = number * 100; i < number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nEnd of Task " + number + "..");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService =
		// Executors.newSingleThreadExecutor();

		ExecutorService executorService = Executors.newFixedThreadPool(6);

		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		// executorService.execute(new Task(1));
		// executorService.execute(new Task(2));
		executorService.submit(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));

		executorService.shutdown();

	}

}
