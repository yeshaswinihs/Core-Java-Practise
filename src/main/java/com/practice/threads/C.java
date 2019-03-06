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
		Task5 task5 = new Task5(c);
		task5.start();
		task5.setName("Task5");
	}
}

class Task4 extends Thread {
	C c;

	Task4(C c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.m1();
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
