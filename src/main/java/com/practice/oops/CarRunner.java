package com.practice.oops;

class Car {

	String name;

	int num;

	Car(String name) {
		this.name = name;
	}

	void newMthod() {

		final int num1 = 0;

		class A {

			void m2() {
				System.out.println(num1);
			}
		}

	}

	class Ferrari {

		int cc;

		Ferrari() {
			System.out.println(name);
			System.out.println(cc);
		}

	}

	void myMethod() {
		int a = 1;
		final int b = a * 2;
		int c = 3;
		int d = 4;
		c = a++;
		class MyAnonClass {
			MyAnonClass() {
				// a, b, c, or d?
				// Only Variable b can be accessed
				// Only final and effectively final variables can be accessed
				// inside inner class
				System.out.println(b);

			}

		}
		d++;
	}

}

public class CarRunner {
	public static void main(String[] args) {
		Car ferrari = new Car("Ferrari");
		Car.Ferrari enzo = ferrari.new Ferrari();
	}
}
