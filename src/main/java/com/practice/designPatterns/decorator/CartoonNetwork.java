package com.practice.designPatterns.decorator;

public class CartoonNetwork extends ChannelDecorator {

	public CartoonNetwork(SatelliteTV satelliteTV) {
		super(satelliteTV);
		System.out.println("Subscribe to Cartoon Network");
	}

	@Override
	public void show(int channelNumber) {
		System.out.println("Check if selected channel is CartoonNetwork");
		if (channelNumber > 300 && channelNumber < 400) {
			System.out.println("Enjoy Tom and Jerry..");
		} else {
			this.getSatelliteTV().show(channelNumber);
		}

	}

	@Override
	public int subscriptionPrice() {
		System.out.println("Cartoon Network : 6");
		return this.getSatelliteTV().subscriptionPrice() + 6;
	}

}