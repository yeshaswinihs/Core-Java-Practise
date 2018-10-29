package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPRunner {

	public static void main(String[] args) {
		// For JDK > 9
		// List<Integer> list = List.of(1,4,7,9);
		// For JDK < 8
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(4);
		numberList.add(7);
		numberList.add(9);

		int sum = numberList.stream().reduce(0, (num1, num2) -> num1 + num2);

		int sumOfOdd = numberList.stream().filter(num -> num % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);

		System.out.println("Sum: " + sum + ", Sum of odd:" + sumOfOdd);

		IntStream.range(0, 10).map(element -> element * element).forEach(element -> System.out.println(element));

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");

		// List.of("Apple", "Ant", "Bat")
		list.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.println(element));

		// List.of("Apple", "Ant", "Bat")
		list.stream().map(element -> element.length()).forEach(element -> System.out.println(element));

		System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.toList()));

	}

}
