package com.java.practise.loops;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(6);
		System.out.println("isPrime: " + number.isPrime());

		int sum = number.sumUptoN();
		System.out.println("Sum: " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of Divisors: " + sumOfDivisors);

		number.printNumberTriangle();

	}

}
