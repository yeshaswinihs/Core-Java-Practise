package com.practice.threads;

//Program results in Deadlock
//Remove synchronized keyword from one of the last method for normal execution of the program.
class A {

	synchronized public void d1(B b) {
		System.out.println("Thread 1 calling d1 method");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 1 calling last of B");
		b.last();
	}

	synchronized public void last() {
		System.out.println("Last of A");
	}

}

class B {

	synchronized public void d2(A a) {
		System.out.println("Thread 2 calling d2 method");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 2 calling last of A");
		a.last();
	}

	synchronized public void last() {
		System.out.println("Last of B");
	}
}

class MyThread6 extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start();

		a.d1(b);

	}

	@Override
	public void run() {
		b.d2(a);
	}
}

public class DeadlockRunner {

	public static void main(String[] args) {

		MyThread6 t = new MyThread6();
		t.m1();
	}
}
