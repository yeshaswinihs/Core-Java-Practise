package com.practice.exceptions;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			threadSleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void threadSleep() throws InterruptedException {
		Thread.sleep(1000);
	}

}
