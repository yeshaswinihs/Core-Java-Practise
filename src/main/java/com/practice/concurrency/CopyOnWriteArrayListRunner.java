package com.practice.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CopyOnWriteArrayListRunner {
	public static void main(String[] args) {

		// Normal ArrayList will throw java.util.ConcurrentModificationException
		// if tried to modify while iterating
		// Since it follows Fail-Fast by design
		List<String> list = new ArrayList<>();

		// Uses ReentrantLock hence it is Thread safe
		// It follows Fail-Safe by design
		// List<String> list = new CopyOnWriteArrayList<>();

		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		Iterator<String> iterator = list.iterator();
		int counter = 0;
		while (iterator.hasNext()) {
			counter++;
			if (list.contains("Bat")) {
				System.out.println("Removing element..");
				list.remove(1);
				list.add("Rat");
			}
			System.out.println(counter);
			System.out.println(iterator.next());
		}
		System.out.println(list);

	}

}
