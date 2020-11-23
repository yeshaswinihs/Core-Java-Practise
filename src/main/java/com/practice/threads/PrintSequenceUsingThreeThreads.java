package com.practice.threads;

public class PrintSequenceUsingThreeThreads {

	public static void main(String[] args) {
		PrintSeq printSeq = new PrintSeq();
		printSeq.count = 1;

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				printSeq.printT1();

			}
		}, "T1");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				printSeq.printT2();

			}
		}, "T2");

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {

				printSeq.printT3();

			}
		}, "T3");
//		T1 t1 = new T1(printSeq, "T1");
//		T1 t2 = new T1(printSeq, "T2");
//		T1 t3 = new T1(printSeq, "T3");
		t1.start();
		t2.start();
		t3.start();
	}

}

class PrintSeq {
	int max = 10;
	int count;

	synchronized void printT1() {
		while (count < max) {

			while (count % 3 != 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " is printing " + count);

			count++;
			notifyAll();

		}

	}

	synchronized void printT2() {
		while (count < max) {

			while (count % 3 != 2) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " is printing " + count);

			count++;
			this.notifyAll();

		}
	}

	synchronized void printT3() {
		while (count < max) {

			while (count % 3 != 0) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println(Thread.currentThread().getName() + " is printing " + count);

			count++;
			this.notifyAll();

		}
	}
}

//class T1 extends Thread {
//	PrintSeq printSeq;
//	String name;
//
//	T1(PrintSeq printSeq, String name) {
//		this.printSeq = printSeq;
//		setName(name);
//	}
//
//	@Override
//	public void run() {
//
//		printSeq.printT1();
//	}
//}
//
//class T2 extends Thread {
//	PrintSeq printSeq;
//	String name;
//
//	T2(PrintSeq printSeq, String name) {
//		this.printSeq = printSeq;
//		setName(name);
//	}
//
//	@Override
//	public void run() {
//
//		printSeq.printT2();
//	}
//}
//
//class T3 extends Thread {
//	PrintSeq printSeq;
//	String name;
//
//	T3(PrintSeq printSeq, String name) {
//		this.printSeq = printSeq;
//		setName(name);
//	}
//
//	@Override
//	public void run() {
//
//		printSeq.printT3();
//	}
//}
