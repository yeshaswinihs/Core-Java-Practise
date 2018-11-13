package com.practice.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	// Locking the operations without using synchronized keyword
	// Instead of locking complete block of code we can use this and lock only
	// particular statements
	// This improves performance
	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

}
