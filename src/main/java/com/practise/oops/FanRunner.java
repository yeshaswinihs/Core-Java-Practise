package com.practise.oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan usha = new Fan("Usha", 10, "Brown");

		usha.switchOn();
		System.out.println(usha);
		usha.setSpeed((byte) 3);
		System.out.println(usha);
		usha.switchOff();
		System.out.println(usha);
	}

}
