package com.practice.threads;

public class EvenOddPgmUsingThreads {

	public static void main(String[] args) {
		PrintEvenOrOdd printEvenOrOdd = new PrintEvenOrOdd();
		printEvenOrOdd.odd = true;
		EvenThread evenThread = new EvenThread(printEvenOrOdd);
		OddThread oddThread = new OddThread(printEvenOrOdd);
		evenThread.start();
		oddThread.start();
	}
}

class PrintEvenOrOdd {
	boolean odd;
	int count = 1;
	int max = 10;

	synchronized void printEven() {
		while (count < max) {

			while (odd) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread() + "is printing number:" + count);
			count++;
			odd = true;
			notify();
		}
	}

	synchronized void printOdd() {
		while (count < max) {

			while (!odd) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread() + "is printing number:" + count);
			count++;
			odd = false;
			notify();
		}
	}
}

class EvenThread extends Thread {
	PrintEvenOrOdd printEvenOrOdd;

	public EvenThread(PrintEvenOrOdd printEvenOrOdd) {
		this.printEvenOrOdd = printEvenOrOdd;
	}

	@Override
	public void run() {
		setName("Even Thread");
		printEvenOrOdd.printEven();

	}
}

class OddThread extends Thread {
	PrintEvenOrOdd printEvenOrOdd;

	public OddThread(PrintEvenOrOdd printEvenOrOdd) {
		this.printEvenOrOdd = printEvenOrOdd;
	}

	@Override
	public void run() {
		setName("Odd Thread");
		printEvenOrOdd.printOdd();
	}
}
