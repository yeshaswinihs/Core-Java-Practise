package com.practice.strings;

public class StringRunner {

	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.substring(6));
		System.out.println(str.substring(3, 5));
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str.indexOf("l"));
		System.out.println(str.indexOf("World"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.contains("World"));
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("World"));
		System.out.println(str.isEmpty());
		System.out.println(str.equals("Hello"));

		String test = "Test String";
		System.out.println(test);
		System.out.println(test.hashCode());
		test = "Test Updated";
		System.out.println(test);
		System.out.println(test.hashCode());
		test = "Test String";
		System.out.println(test);
		System.out.println(test.hashCode());

		StringBuffer bufferStr = new StringBuffer("Buffer String");
		bufferStr.append(" Appended");

		Integer number1 = new Integer(5);
		Integer number2 = new Integer(5);

		Integer number3 = Integer.valueOf(5);
		Integer number4 = Integer.valueOf(5);

		System.out.println(number1 == number2);
		System.out.println(number3 == number4);
	}
}
