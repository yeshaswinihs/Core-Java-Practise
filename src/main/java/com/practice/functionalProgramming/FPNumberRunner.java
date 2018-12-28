package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(4);
		numberList.add(7);
		numberList.add(9);

		int sum = numberList.stream().reduce(0, (num1, num2) -> num1 + num2);

		// System.out.println("Sum: " + sum);

		int sumOfOdd = numberList.stream().filter(num -> num % 2 == 1).reduce(0, (num1, num2) -> {
			// System.out.println(num1 + " " + num2);
			return num1 + num2;
		});

		// System.out.println("Sum of odd: " + sumOfOdd);

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
		list.stream().forEach(i -> System.out.print(i + " "));
		// /list.stream().forEach(i -> System.out.print(i + " "));
		// list.parallelStream().forEach(i -> System.out.print(i + " "));

	}

}
