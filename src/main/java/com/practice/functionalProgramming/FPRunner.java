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
		System.out.println("Number list: ");
		numberList.stream().forEach(e -> System.out.print(e + " "));

		IntStream.range(0, 10).map(element -> element * element).forEach(element -> System.out.println(element));

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		System.out.println();
		list.stream().filter(e -> e.endsWith("at")).forEach(e -> System.out.print(e + " "));

		System.out.println();

		// List.of("Apple", "Ant", "Bat")
		list.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.println(element));

		// List.of("Apple", "Ant", "Bat")
		list.stream().map(element -> element.length()).forEach(element -> System.out.println(element));

		System.out.println(IntStream.range(0, 10).boxed().collect(Collectors.toList()));

	}

}
