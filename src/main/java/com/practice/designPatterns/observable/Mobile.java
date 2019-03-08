package com.practice.designPatterns.observable;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Mobile - The price of " + stock.getName() + " has changed: " + stock.getPrice());

	}

}
