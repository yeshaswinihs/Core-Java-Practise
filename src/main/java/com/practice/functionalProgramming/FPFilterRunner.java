package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FPFilterRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		System.out.println("Words ending with 'at'");
		list.stream().filter(e -> e.endsWith("at")).forEach(e -> System.out.print(e + " "));

		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(4);
		numberList.add(7);
		numberList.add(9);

		System.out.println("\nEven Numbers: ");
		numberList.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));

		System.out.println("\nOdd Numbers: ");
		numberList.stream().filter(num -> num % 2 == 1).forEach(num -> System.out.print(num + " "));
	}

}
