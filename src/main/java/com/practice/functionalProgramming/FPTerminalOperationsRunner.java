package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPTerminalOperationsRunner {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(23);
		numberList.add(12);
		numberList.add(34);
		numberList.add(53);

		Optional<Integer> max = numberList.stream().max((var1, var2) -> Integer.compare(var1, var2));

		System.out.println(max);
		System.out.println(max.get());
		System.out.println(max.isPresent());

		List<Integer> numbers = numberList.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
		numbers.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();

		// collect() method can be used only on Stream
		// Intstream will not return stream hence boxing is required
		List<Integer> squareOfNumbers = IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
		squareOfNumbers.stream().forEach(n -> System.out.print(n + " "));

		int[] intArray = { 10, 20, 30 };

	}
}
