package com.practice.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String var1, String var2) {

		return var1.length() < var2.length() ? -1 : var1.length() > var2.length() ? 1 : 0;

		// return Integer.compare(var1.length(), var2.length());

	}

}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();

		animals.add("Ant");
		animals.add("Cat");
		animals.add("Bunny");
		animals.add("Elephant");

		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new Comparator<String>(){

			@Override
			public int compare(String var1, String var2) {
				
				return Integer.compare(var1.length(), var2.length());
			}});
		System.out.println(animals);

	}

}
