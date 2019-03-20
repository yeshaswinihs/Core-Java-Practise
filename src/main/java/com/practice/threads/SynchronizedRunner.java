package com.practice.threads;

public class SynchronizedRunner {

	public static void main(String[] args) {

		/*Display display = new Display();
		
		MyThread t1 = new MyThread(display, "Rahul");
		MyThread t2 = new MyThread(display, "Rohit");
		MyThread t3 = new MyThread(display, "Dhawan");

		t1.start();
		t2.start();
		t3.start();
*/		
		Display d1 = new Display();
		Display d2 = new Display();
		
		MyThread t1 = new MyThread(d1, "Rahul");
		MyThread t2 = new MyThread(d2, "Rohit");
		
		t1.start();
		t2.start();

	}

}

class Display {
	synchronized public void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread {

	private Display display;
	private String name;

	public MyThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.wish(name);
	}

}