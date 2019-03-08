package com.practice.threads;

class Task1 extends Thread {

	@Override
	public void run() {
		System.out.println("\nTask 1 started..");
		for (int i = 101; i < 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nEnd of Task 1..");
	}

}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask 2 started..");
		for (int i = 201; i < 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nEnd of Task 2..");
	}
}



public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {



		// Task 1
		Task1 task1 = new Task1();
		task1.start();

		// Task 2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();



		// Task 3

		System.out.println("\nTask 3 started..");
		for (int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nEnd of Task 3..");

		task1.join();
		// task2Thread.join();


		System.out.println("\nEnd of Main");

		// throw new RuntimeException("New Exception");

	}

}
