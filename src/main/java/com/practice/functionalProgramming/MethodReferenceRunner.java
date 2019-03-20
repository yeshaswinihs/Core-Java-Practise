package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReferenceRunner {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		System.out.println("\nLength of strings in the list:");
		list.stream().map(String::length).forEach(System.out::println);

		List<Integer> numberList = new ArrayList<>();
		numberList.add(23);
		numberList.add(null);
		numberList.add(34);
		numberList.add(53);

		Integer number = 5;
		Optional<Integer> optionalNumber = Optional.of(number);
		
		// Using Optional to check if a list has null elements
		Optional<Integer> max = numberList.stream()
				.map(num -> Optional.of(num))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.filter(MethodReferenceRunner::isEven)
				.max(Integer::compare);
		
		
		Optional<Integer> maxNumber = numberList.stream().filter(obj -> obj != null)
				.filter(MethodReferenceRunner::isEven).max(Integer::compare);
		System.out.println();
		System.out.println(max.get());

	}

	static boolean isEven(Integer num) {
		return num % 2 == 0;
	}

}
