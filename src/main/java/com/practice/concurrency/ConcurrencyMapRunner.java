package com.practice.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrencyMapRunner {

	public static void main(String[] args) {
		// /Map<Character, LongAdder> occurences = new Hashtable<>();
		// Map<Character, LongAdder> occurences = new HashMap<>();
		ConcurrentMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();
		String str = "ABCD ABCD ABCD";

		for (Character character : str.toCharArray()) {
			occurences.computeIfAbsent(character, ch -> new LongAdder()).increment();

			/*
			 * LongAdder longAdder = occurences.get(ch); if (longAdder == null)
			 * { longAdder = new LongAdder(); } longAdder.increment();
			 * occurences.put(character, longAdder);
			 */
		}

		System.out.println(occurences);

	}

}
