package com.practice.designPatterns.singleton;

public class SingletonThreadSafeRunner {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Satellite.getInstance());
		}
	}
}

class Satellite1 {

	private Satellite1() {
	}

	private static class SatelliteHelper {
		private static Satellite1 instance = new Satellite1();
	}

	public static Satellite1 getInstance() {
		return SatelliteHelper.instance;
	}

}