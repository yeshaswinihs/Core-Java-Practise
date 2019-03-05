package com.practice.threads;

// Same object is accessed by both the threads
public class ObjectLevelLockRunner {

	public static void main(String[] args) {
		Display2 d = new Display2();

		MyThread2 t1 = new MyThread2(d);
		MyThread3 t2 = new MyThread3(d);

		t1.start();
		t2.start();
	}
}

class Display2 {

	public synchronized void displayNumbers() {
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void displayCharacters() {
		for (int i = 65; i < 76; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {

	private Display2 display;

	public MyThread2(Display2 display) {
		super();
		this.display = display;
	}

	@Override
	public void run() {
		display.displayNumbers();
	}

}

class MyThread3 extends Thread {

	private Display2 display;

	public MyThread3(Display2 display) {
		super();
		this.display = display;
	}

	@Override
	public void run() {
		display.displayCharacters();
	}

}
