package com.practice.designPatterns.decorator;

public class ESPN extends ChannelDecorator {

	public ESPN(SatelliteTV satelliteTV) {
		super(satelliteTV);
		System.out.println("Subscribe to ESPN");
	}

	@Override
	public void show(int channelNumber) {
		System.out.println("Check if selected channel is ESPN");
		if (channelNumber > 100 && channelNumber < 200) {
			System.out.println("Enjoy Football match..");
		} else {
			this.getSatelliteTV().show(channelNumber);
		}

	}

	@Override
	public int subscriptionPrice() {
		System.out.println("ESPN : 7 ");
		return this.getSatelliteTV().subscriptionPrice() + 7;
	}

}
