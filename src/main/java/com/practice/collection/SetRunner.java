package com.practice.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {

		List<Character> characters = new ArrayList<>();
		characters.add('A');
		characters.add('Z');
		characters.add('A');
		characters.add('B');
		characters.add('G');
		characters.add('F');
		characters.add('A');
		characters.add('B');
		characters.add('Z');

		// Unique Elements
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println(hashSet);

		for (Character ch : hashSet) {
			System.out.print(ch);
		}
		System.out.println();
		// Sorted Unique Elements
		TreeSet<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet);

		// Methods from Navigable Interface
		// Element less than specified- Inclusive
		System.out.println("floor(): " + treeSet.floor('G'));
		// Element less than specified - Exclusive
		System.out.println("lower(): " + treeSet.lower('G'));
		// Element greater than specified- Inclusive
		System.out.println("ceiling(): " + treeSet.ceiling('G'));
		// Element greater than specified- Exclusive
		System.out.println("higher(): " + treeSet.higher('G'));
		// Default: Lower limit - Inclusive Upper limit - Exclusive
		System.out.println("subSet(): " + treeSet.subSet('F', 'G'));
		// Method from SortedSet Explicitly mention inclusive or exclusive
		// Lower limit - Inclusive Upper limit - Inclusive
		System.out.println("subSet(): " + treeSet.subSet('F', true, 'G', true));
		// Default - Exclusive
		System.out.println("headSet(): " + treeSet.headSet('G'));
		// Method from SortedSet Explicitly mention inclusive or exclusive
		System.out.println("headSet(): " + treeSet.headSet('G', true));
		// Default - Inclusive
		System.out.println("tailSet(): " + treeSet.tailSet('G'));

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println(linkedHashSet);

	}

}
