package com.practice.designPatterns.observable;

public class ObserverPatternRunner {

	public static void main(String[] args) {

		// Stocks
		IBM ibm = new IBM();
		Microsoft microsoft = new Microsoft();
		Apple apple = new Apple();

		// Observers
		Mobile mobile = new Mobile();
		DisplayBoard displayBoard = new DisplayBoard();

		// Register the observers
		ibm.registerObserver(mobile);
		ibm.registerObserver(displayBoard);

		microsoft.registerObserver(mobile);
		microsoft.registerObserver(displayBoard);

		apple.registerObserver(mobile);
		apple.registerObserver(displayBoard);

		// Update the stock prices
		for (int i = 0; i < 100; i++) {
			ibm.updateStockPrice((int) (Math.random() * 101) + 1);
			microsoft.updateStockPrice((int) (Math.random() * 101) + 1);
			apple.updateStockPrice((int) (Math.random() * 101) + 1);
		}
	}

}
