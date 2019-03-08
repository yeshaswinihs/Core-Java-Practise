package com.practice.designPatterns.decorator;

public abstract class ChannelDecorator implements SatelliteTV {

	private SatelliteTV satelliteTV;

	public ChannelDecorator(SatelliteTV satelliteTV) {
		super();
		this.satelliteTV = satelliteTV;
	}

	public SatelliteTV getSatelliteTV() {
		return satelliteTV;
	}

}
