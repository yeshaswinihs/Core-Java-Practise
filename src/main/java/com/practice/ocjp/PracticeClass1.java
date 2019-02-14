package com.practice.ocjp;

public class PracticeClass1 {

	/*
	 * static int x[]; static { x[0] = 1; }
	 */

	int a;

	private void setA(int a) {
		a = a;
	}

	private int getA() {
		return a;
	}

	public static void main(String[] args) {

		PracticeClass1 instance = new PracticeClass1();

		instance.setA(10);
		System.out.println("Get A: " + instance.getA());

		String str = "null";

		if (str == null) {
			System.out.println("Null");
		} else if (str.length() == 0) {
			System.out.println("Length is 0");
		} else {
			System.out.println("String");
		}

		// int[] arr = null;
		// arr[0] = 3;

		int sum = 0;
		for (int x = 0; x < 10; x++) {
			sum += x;
		}

		// Below line will not be compiled due to scope issue
		// System.out.println("Sum of 0 to " + x + " is :" + sum);

		sum(3, 5);

		// String str = null;

		/*
		 * if (str == "A" | str.length() == 0) {
		 * 
		 * System.out.println("hello"); }
		 */
		String str1 = "A";

		switch (str1) {
		default:
			System.out.println("default");
		case "a":
			System.out.println("a");

		case "A":
			System.out.println("A");

		}
	}

	private static void sum(int i, int j) {
		// TODO Auto-generated method stub

	}


}
