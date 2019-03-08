package com.practice.designPatterns.decorator;

public class Discovery extends ChannelDecorator {

	public Discovery(SatelliteTV satelliteTV) {
		super(satelliteTV);
		System.out.println("Subscribe to Discovery");
	}

	@Override
	public void show(int channelNumber) {
		System.out.println("Check if selected channel is Discovery");
		if (channelNumber > 300 && channelNumber < 400) {
			System.out.println("Enjoy Man vs Wild..");
		} else {
			this.getSatelliteTV().show(channelNumber);
		}

	}

	@Override
	public int subscriptionPrice() {
		System.out.println("Discovery : 10");
		return this.getSatelliteTV().subscriptionPrice() + 10;
	}

}