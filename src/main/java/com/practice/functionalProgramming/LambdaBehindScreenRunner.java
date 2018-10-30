package com.practice.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer num) {
		return num % 2 == 0;
	}

}

class EvenNumberConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer var1) {
		System.out.print(var1 + " ");

	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer num) {
		return num * num;
	}

}

public class LambdaBehindScreenRunner {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(23);
		numberList.add(43);
		numberList.add(34);
		numberList.add(45);
		numberList.add(36);
		numberList.add(48);

		numberList.stream().filter(createEvenPredicate()).forEach(num -> System.out.print(num + " "));

		// filter() takes Predicate as Input
		// Predicate is a Functional Interface with test() method
		// Takes the input and tells if it is true or false

		// Stream<T> filter(Predicate<? super T> var1);
		// boolean test(T var1);

		System.out.println();
		numberList.stream().filter(new EvenNumberPredicate()).forEach(num -> System.out.print(num + " "));
		System.out.println();

		// forEach() takes Consumer as Input
		// Consumer is a Functional Interface with accept() method
		// Consumes the input

		// void forEach(Consumer<? super T> var1);
		// void accept(T var1);

		numberList.stream().filter(new EvenNumberPredicate()).forEach(new EvenNumberConsumer());
		System.out.println();

		// Returning function from method
		Predicate<? super Integer> isEvenPredicate = createEvenPredicate();
		// Storing Function in Variables
		Predicate<? super Integer> isOddPredicate = num -> num % 2 == 1;

		numberList.stream().filter(isOddPredicate).map(num -> num * num).forEach(num -> System.out.print(num + " "));

		// map() takes Function as Input
		// Function is a Functional Interface with apply() method
		// Takes an Input and Gives Output

		// <R> Stream<R> map(Function<? super T, ? extends R> var1);
		// R apply(T var1);
		System.out.println();
		numberList.stream().filter(isEvenPredicate).map(new NumberSquareMapper())
				.forEach(num -> System.out.print(num + " "));

		// Storing Functions in Variables

	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return num -> num % 2 == 0;
	}

}
