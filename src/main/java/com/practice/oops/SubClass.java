package com.practice.oops;

class SuperClass {

	public static void staticMethod() {

		System.out.println("SuperClass: inside staticMethod");

	}

}

public class SubClass extends SuperClass {

	// overriding the static method

	public static void staticMethod() {

		System.out.println("SubClass: inside staticMethod");

	}

	public static void main(String[] args) {
		
		
		
		SuperClass superClass = new SubClass();
		
		superClass.staticMethod();
		
		SubClass subClass = new SubClass();

		subClass.staticMethod();

	}

}