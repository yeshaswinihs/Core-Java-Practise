package com.practice.threads;

public class ClassLevelLockRunner {

	public static void main(String[] args) {
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();

		MyThread1 t1 = new MyThread1(d1, "Rahul");
		MyThread1 t2 = new MyThread1(d2, "Rohit");

		t1.start();
		t2.start();

	}
}

class Display1 {
	// Class level lock is used to synchronized the method across all the
	// objects of a class
	// Method should be declared as static synchronized
	static synchronized public void wish(String name) {
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

class MyThread1 extends Thread {

	private Display1 display;
	private String name;

	public MyThread1(Display1 display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.wish(name);
	}

}
