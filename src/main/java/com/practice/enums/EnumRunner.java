package com.practice.enums;

import java.util.Arrays;

enum Season {
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);

	private int value;

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class EnumRunner {

	public static void main(String[] args) {
		Season winter = Season.WINTER;

		Season summer = Season.valueOf("SUMMER");

		System.out.println(winter);
		System.out.println(summer);
		System.out.println(summer.name());
		// Position
		System.out.println(summer.ordinal());
		System.out.println(summer.getValue());
		System.out.println(Arrays.toString(Season.values()));

	}

}
