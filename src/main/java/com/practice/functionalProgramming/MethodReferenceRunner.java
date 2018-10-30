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
		list.stream().map(String::length).forEach(System.out::print);

		List<Integer> numberList = new ArrayList<>();
		numberList.add(23);
		numberList.add(12);
		numberList.add(34);
		numberList.add(53);

		Optional<Integer> max = numberList.stream().filter(new MethodReferenceRunner()::isEven).max(Integer::compare);
		System.out.println();
		System.out.println(max.get());

	}

	boolean isEven(Integer num) {
		return num % 2 == 0;
	}

}
