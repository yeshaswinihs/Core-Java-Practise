package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListRunner {

	public static void main(String[] args) {
		List<String> wildAnimals = new ArrayList<>();
		wildAnimals.add("Lion");
		wildAnimals.add("Tiger");
		wildAnimals.add("Jaguar");
		System.out.println("Wild Animals -> ");
		wildAnimals.stream().filter(var1 -> var1.startsWith("T")).forEach(System.out::println);

		List<String> petAnimals = new LinkedList<>();
		petAnimals.add("Cow");
		petAnimals.add("Dog");
		petAnimals.add("Cat");
		petAnimals.remove(1);
		System.out.println("Pet Animals -> ");
		petAnimals.stream().forEach(var1 -> System.out.println(var1));

		List<String> animals = new Vector<>();
		animals.addAll(wildAnimals);
		animals.addAll(petAnimals);
		animals.remove("Jaguar");
		System.out.println("All Animals -> ");
		animals.stream().forEach(animal -> System.out.println(animal));

		System.out.println("All Animals using Iterator -> ");
		Iterator<String> iterator = animals.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		List<Integer> numbers = new ArrayList<>();
		numbers.add(101);
		numbers.add(103);
		numbers.add(102);
		numbers.add(104);

		// numbers.remove(102); // throws java.lang.IndexOutOfBoundsException
		// numbers.remove(Integer.valueOf(102)); // Correct way of removing
		// Integer
		// object from List
		System.out.println();
		numbers.stream().forEach(System.out::print);
		numbers.sort((var1, var2) -> Integer.compare(var1, var2));
		System.out.println();
		numbers.stream().forEach(System.out::print);
	}

}
