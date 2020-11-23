package com.practice.threads;

public class DeadlockGeeksForGeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		Thread1 t1 = new Thread1(s1, s2);
		Thread2 t2 = new Thread2(s1, s2);

		t1.start();
		t2.start();

	}

}

class Shared {
	// first synchronized method
	synchronized void test1(Shared s2) {
		System.out.println("test1-begin");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// taking object lock of s2 enters
		// into test2 method
		s2.last1();
		System.out.println("test1-end");
	}

	synchronized void last1() {
		System.out.println("last1" + Thread.currentThread());

	}

	// second synchronized method
	synchronized void test2(Shared s1) {
		System.out.println("test2-begin");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// taking object lock of s1 enters
		// into test1 method
		s1.last1();
		System.out.println("test2-end");
	}
}

class Thread1 extends Thread {
	Shared s1;
	Shared s2;

	Thread1(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		s1.test1(s2);
	}
}

class Thread2 extends Thread {
	Shared s1;
	Shared s2;

	Thread2(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		s2.test2(s1);
	}
}