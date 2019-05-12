package com.practice.threads;

public class C {

	synchronized void m1() {
		System.out.println("method m1" + Thread.currentThread().getName());

	}

	synchronized void m2() {
		System.out.println("method m2" + Thread.currentThread().getName());


	}

	synchronized void m3() {
		System.out.println("method m3");
	}

	public static void main(String[] args) {
		C c = new C(); // shared resource
		Task4 task4 = new Task4(c);
		task4.setName("Task4");
		task4.start();
		try {
			task4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Task5 task5 = new Task5(c);
		task5.setName("Task5");
		task5.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
		System.out.println("End of main method");
		
	}
}

class Task4 extends Thread {
	C c;

	Task4(C c) {
		this.c = c;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			c.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class Task5 extends Thread {
	C c;

	Task5(C c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.m1();
	}
}
