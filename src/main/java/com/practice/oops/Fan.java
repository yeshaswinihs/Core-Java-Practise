package com.practice.oops;

public class Fan {

	private String name;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String name, double radius, String color) {
		this.name = name;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
		this.setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Fan [name=" + name + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speed=" + speed
				+ "]";
	}

}
