package com.practice.threads;

public class SynchronizedBlockRunner {

	public static void main(String[] args) {

		Display3 display1 = new Display3();
		Display3 display2 = new Display3();

		MyThread4 t1 = new MyThread4(display1, "Rahul");
		MyThread4 t2 = new MyThread4(display2, "Rohit");
		// MyThread4 t3 = new MyThread4(display, "Dhawan");

		t1.start();
		t2.start();
		// t3.start();

	}

}

class Display3 {
	public void wish(String name) {
		;
		;
		;
		;
		;
		;// Few lines of code
		// Object level synchronization
		// synchronized (this) {
		// Class level synchronization
		synchronized (Display3.class) {
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
		;
		;
		;
		;
		;
		;// Few lines of code
	}
}

class MyThread4 extends Thread {

	private Display3 display;
	private String name;

	public MyThread4(Display3 display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.wish(name);
	}

}