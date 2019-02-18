package com.practice.strings;

public class ImmutableStringRunner {

	public static void main(String[] args) {

		System.out.println("\n-----Checking Immutable String Property---------\n");

		String test = "Test String";
		System.out.println("Intial Value - test: " + test);
		System.out.println("test.hashCode(): " + test.hashCode());
		test = "Test Updated";
		System.out.println("Updating with new value - test: " + test);
		System.out.println("test.hashCode(): " + test.hashCode());
		test = "Test String";
		System.out.println("Updating with old value - test: " + test);
		System.out.println("test.hashCode(): " + test.hashCode());

		System.out.println("\n-----String Buffer---------\n");

		StringBuffer bufferStr = new StringBuffer("Buffer String");
		System.out.println("bufferStr: " + bufferStr);
		System.out.println("bufferStr.hashCode(): " + bufferStr.hashCode());
		bufferStr.append(" Appended");
		System.out.println("bufferStr after appending: " + bufferStr);
		System.out.println("bufferStr.hashCode() after appending: " + bufferStr.hashCode());

		String normalString = "Normal String";
		System.out.println("\nnormalString: " + normalString);
		System.out.println("normalString.hashCode(): " + normalString.hashCode());
		normalString = normalString + " Appended";
		System.out.println("normalString after appending: " + normalString);
		System.out.println("normalString.hashCode() after appending: " + normalString.hashCode());

		System.out.println("\n-----Integer Class---------\n");

		Integer number1 = new Integer(5);
		Integer number2 = new Integer(5);

		Integer number3 = Integer.valueOf(128);
		Integer number4 = Integer.valueOf(128);

		System.out.println("number1 -> new Integer(5), number2 -> new Integer(5)");
		System.out.print("number1 == number2: ");
		System.out.println(number1 == number2);

		System.out.println("number3 -> Integer.valueOf(5), number4 -> Integer.valueOf(5)");
		System.out.print("number3 == number4: ");
		System.out.println(number3 == number4);

	}

}
