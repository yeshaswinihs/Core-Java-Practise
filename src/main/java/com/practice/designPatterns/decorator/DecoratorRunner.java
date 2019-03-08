package com.practice.designPatterns.decorator;

public class DecoratorRunner {

	public static void main(String[] args) {

		SatelliteTV satelliteTV = new Discovery(new ESPN(new CartoonNetwork(new SkyTV())));
		satelliteTV.show(120);
		System.out.println(satelliteTV.subscriptionPrice());
	}

}
