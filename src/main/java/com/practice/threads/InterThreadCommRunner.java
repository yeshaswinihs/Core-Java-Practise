package com.practice.threads;

public class InterThreadCommRunner {

	public static void main(String[] args) throws InterruptedException {

		MyThread5 t = new MyThread5();
		t.start();
		//Thread.sleep(1000);
		synchronized (t) {
			System.out.println("Main thread calls wait()..");
			t.wait(100); // Maximum wait time.
		}

		// t.join();
		System.out.println("Main thread gets total..");
		System.out.println(t.getTotal());

	}

}

class MyThread5 extends Thread {

	private int total;

	public int getTotal() {
		return total;
	}

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculating total..");
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			System.out.println("Child thread completes calculating total..");
			this.notify();
		}
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

}