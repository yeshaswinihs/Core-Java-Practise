package com.practise.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		String test = "This is a great thing";

		char[] charArray = test.toCharArray();

		Set<Character> characterSet = new HashSet<>();
		for (char ch : charArray) {
			characterSet.add(ch);
		}

		Map<Character, Integer> hashMap = new HashMap<>();
		for (Character ch : characterSet) {
			hashMap.put(ch, 0);
		}

		for (char element : charArray) {
			int count = hashMap.get(element);
			hashMap.put(element, ++count);
		}

		System.out.println(hashMap);

		String str = "This is an awesome occassion, This has never happened before";
		char[] newArray = str.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (Character ch : newArray) {
			if (charCountMap.containsKey(ch)) {
				int count = charCountMap.get(ch);
				charCountMap.put(ch, ++count);
			} else {
				charCountMap.put(ch, 1);
			}

		}
		System.out.println(charCountMap);

		String[] stringArray = str.split(" ");
		Map<String, Integer> stringCountMap = new HashMap<>();
		for (String string : stringArray) {
			if (stringCountMap.containsKey(string)) {
				int count = stringCountMap.get(string);
				stringCountMap.put(string, ++count);
			} else {
				stringCountMap.put(string, 1);
			}

		}

		System.out.println(stringCountMap);

	}

}
