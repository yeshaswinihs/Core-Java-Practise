package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FPIntermediateOperationsRunner {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(3);
		numberList.add(5);
		numberList.add(8);
		numberList.add(213);
		numberList.add(45);
		numberList.add(5);
		numberList.add(7);

		System.out.println("Sorted numbers: ");
		numberList.stream().sorted().forEach(e -> System.out.print(e + " "));

		System.out.println("\nDistinct numbers :");
		numberList.stream().distinct().forEach(e -> System.out.print(e + " "));

		System.out.println("\nSquares of sorted distinct numbers: ");
		numberList.stream().distinct().sorted().map(num -> num * num).forEach(num -> System.out.print(num + " "));

		System.out.println("\nSquares of numbers :1-10 ");
		IntStream.range(1, 11).map(num -> num * num).forEach(num -> System.out.print(num + " "));

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		System.out.println("\nLower case strings :");
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));

		System.out.println("\nLength of strings in the list:");
		list.stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));

	}

}
