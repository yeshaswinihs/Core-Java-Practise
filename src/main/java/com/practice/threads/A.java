package com.practice.threads;

public class A {

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
		A a = new A(); // shared resource
		Task4 task4 = new Task4(a);
		task4.setName("Task4");
		task4.start();
		Task5 task5 = new Task5(a);
		task5.start();
		task5.setName("Task5");
	}
}

class Task4 extends Thread {
	A a;

	Task4(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.m1();
	}
}

class Task5 extends Thread {
	A a;

	Task5(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.m1();
	}
}
