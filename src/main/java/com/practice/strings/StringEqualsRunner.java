package com.practice.strings;

public class StringEqualsRunner {

	public static void main(String[] args) {
		System.out.println("\n-----Equals Method---------\n");

		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");

		System.out.println("a -> Hello ");
		System.out.println("b -> Hello ");
		System.out.println("c -> new String(Hello): ");

		System.out.println("\nSystem.identityHashCode(a): " + System.identityHashCode(a));
		System.out.println("System.identityHashCode(b): " + System.identityHashCode(b));
		System.out.println("System.identityHashCode(c): " + System.identityHashCode(c));

		System.out.println("\na.hashCode(): " + a.hashCode());
		System.out.println("b.hashCode(): " + b.hashCode());
		System.out.println("c.hashCode(): " + c.hashCode());

		System.out.println("a.equals(b): " + a.equals(b));
		System.out.println("a.equals(c): " + a.equals(c));

		System.out.println("(a == b): " + (a == b));
		System.out.println("(a == c): " + (a == c));

	}

}
