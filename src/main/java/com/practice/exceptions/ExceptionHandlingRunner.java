package com.practice.exceptions;

import java.util.Scanner;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str);
		scanner.close();

		method1();
		System.out.println("End of Main");
	}

	private static void method1() {
		method2();
		System.out.println("End of Method 1");
	}

	@SuppressWarnings("null")
	private static void method2() {
		try {
			String str = null;
			str.length();
			System.out.println("End of Method 2");
		} catch (NullPointerException n) {
			System.out.println("NullPointerException");
			n.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
