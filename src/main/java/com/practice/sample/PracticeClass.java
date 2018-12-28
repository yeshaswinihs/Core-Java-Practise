package com.practice.sample;
/**
 * 
 */

import lombok.ToString;

/**
 * @author 734456
 *
 */
public class PracticeClass {

	static {
		System.out.println("Static Block");
	}

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Method!");

		for (int i = 1; i < 11; i++) {
			// System.out.println("5 x " + i + " = " + i * 5);
		}

		// System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7);

		int a = 1;

		/*
		 * while (a > 0) { a++; System.out.println(a); }
		 */

		int[] intArray = { 4, 2, 3, 7, 8, 5 };
		int min = intArray[0], max = intArray[intArray.length - 1];
		for (int n : intArray) {
			// System.out.println("->" + n);
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
		}
		// System.out.println(min + "-" + max);

		A object1 = new A(2);
		System.out.println(object1);
		A object2 = (A) object1.clone();
		System.out.println(object2);
		A object3 = object1;
		System.out.println(object3);

		B b = new B();
		b.fly();

		C c = new C();
		c.fly();

		B b1 = new C();
		b1.fly();

	}

}

@ToString
class A implements Cloneable {
	private int id;

	A(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class B {
	static void fly() {
		System.out.println("B is flying..");
	}
}

class C extends B {
	void fly1() {
		System.out.println("C is flying..");
	}
}
