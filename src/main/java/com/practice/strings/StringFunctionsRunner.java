package com.practice.strings;

public class StringFunctionsRunner {

	public static void main(String[] args) {

		System.out.println("--------String Functions------\n");

		String str = "Hello World";
		System.out.println("str: " + str);
		System.out.print("Character Array of str: ");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\nstr.length(): " + str.length());
		System.out.println("str.charAt(0): " + str.charAt(0));
		System.out.println("str.substring(6): " + str.substring(6));
		System.out.println("str.substring(3, 5): " + str.substring(3, 5));

		System.out.println("str.indexOf(\"l\"): " + str.indexOf("l"));
		System.out.println("str.indexOf(\"World\"): " + str.indexOf("World"));
		System.out.println("str.lastIndexOf(\"l\"): " + str.lastIndexOf("l"));
		System.out.println("str.contains(\"World\"): " + str.contains("World"));
		System.out.println("str.startsWith(\"Hello\"): " + str.startsWith("Hello"));
		System.out.println("str.endsWith(\"World\"): " + str.endsWith("World"));
		System.out.println("str.isEmpty(): " + str.isEmpty());
		System.out.println("str.equals(\"Hello\"): " + str.equals("Hello"));

	}

}
