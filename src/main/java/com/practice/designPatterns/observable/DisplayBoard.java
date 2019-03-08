package com.practice.designPatterns.observable;

public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Display Board - The price of " + stock.getName() + " has changed: " + stock.getPrice());
	}

}
