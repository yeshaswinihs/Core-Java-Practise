package com.practice.designPatterns.singleton;

public class SingletonRunner {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Satellite.getInstance());
		}
	}
}

class Satellite {

	private static Satellite instance;

	private Satellite() {
	}

	public static Satellite getInstance() {
		if (instance == null) {
			instance = new Satellite();
		}
		return instance;
	}

}
