package com.practice.basicPrograms;

public class Swapping {

	void swapWrapper(WrapperCar wc1, WrapperCar wc2) {
		Car temp = wc1.c;
		wc1.c = wc2.c;
		wc2.c = temp;

	}
	
	void swapWrapperString(WrapperString wc1, WrapperString wc2) {
		String temp = wc1.s;
		wc1.s = wc2.s;
		wc2.s= temp;

	}

	void swap(Car c1, Car c2) {
		// Car temp = c1;
		// c1 = c2;
		// c2 = temp;

		// int temp = c1.a;
		// c1.a = c2.a;
		// c2.a= temp;
	}

	public static void main(String[] args) {
		Car c1 = new Car(1);
		Car c2 = new Car(2);
		WrapperCar wc1 = new WrapperCar(c1);
		WrapperCar wc2 = new WrapperCar(c2);

		Swapping s = new Swapping();
		// s.swap(c1, c2);
		s.swapWrapper(wc1, wc2);
		// System.out.println(wc1.c);
		// System.out.println(wc2.c);

		String s1 = new String("a");
		String s2 = new String("b");
		WrapperString ws1 = new WrapperString(s1);
		WrapperString ws2 = new WrapperString(s2);
		
		//s.swapString(s1, s2);
		s.swapWrapperString(ws1, ws2);
		//System.out.println(s1 + s2);
		System.out.println(ws1);
		System.out.println(ws2);
		StringBuilder sb = new StringBuilder("mutable");
		// System.out.println(sb);
		reverseBuilder(sb);
		// System.out.println(sb);

	}

	private void swapString(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;

	}

	private static void reverseBuilder(StringBuilder sb) {
		sb.reverse();

	}

}

class Car {
	public Car(int a) {
		super();
		this.a = a;
	}

	int a;

	@Override
	public String toString() {
		return "Car [a=" + a + "]";
	}

}

class WrapperCar {
	Car c;

	public WrapperCar(Car c) {
		super();
		this.c = c;
	}

}

class WrapperString {
	String s;

	public WrapperString(String s) {
		super();
		this.s = s;
	}

	@Override
	public String toString() {
		return "WrapperString [s=" + s + "]";
	}

}
