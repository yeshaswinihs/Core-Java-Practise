package com.practice.threads;

public class ThreadInterruptionRunner {

	public static void main(String[] args) throws InterruptedException {

		MyThread7 t = new MyThread7();
		t.start();
		t.sleep(1000);
		t.interrupt();
		// System.out.println("Complete main()..");

	}

}

class MyThread7 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread started..");
		while (true) {
			
			if (Thread.interrupted()) { // Executes until the thread is
										// interrupted
				break; // Breaks the loop once the thread is interrupted
			}

		}

		System.out.println("Complete run()..");

	}

}