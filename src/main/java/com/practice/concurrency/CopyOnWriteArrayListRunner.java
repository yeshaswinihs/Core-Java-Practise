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

		// list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		// list.add("Rat");

		Iterator<String> iterator = list.iterator();
		int counter = -1;
		while (iterator.hasNext()) {
			counter++;
			System.out.println(counter);
			// iterator.remove();
			// System.out.println(iterator.next());
			// if (list.contains("Bat")) {
				// System.out.println("Adding element..");
				// list.add("Rat");
				// list.remove(1);
				// iterator.remove();
				// System.out.println("Element added..");
			// }

			System.out.println(list);
			String str = iterator.next();
			System.out.println("Elemenet : " + str);

			if (str.equals("Bat")) {
				// iterator.remove();
				list.remove(0);
				// list.add("Rat");

			}

			System.out.println("List after removing in Iteration: " + counter + " List: " + list);


			// System.out.println(iterator.next());
		}

		System.out.println("List after removing: " + list);

		/*for (String str : list) {
			if (str.equals("Bat")) {
				list.remove(str);
			}
		}*/

		// System.out.println(list);

	}

}
