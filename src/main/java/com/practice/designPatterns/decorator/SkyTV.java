package com.practice.designPatterns.decorator;

public class SkyTV implements SatelliteTV {

	SkyTV() {
		System.out.println("Subscribe to Default Channels of SkyTV");
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber<100){
			System.out.println("Basic New Channels");
		} else {
			System.out.println("You are not subcribed to this channel. Please subscribe");
		}

	}

	@Override
	public int subscriptionPrice() {
		System.out.println("Basic Fee : 100 ");
		return 100;
	}

}
