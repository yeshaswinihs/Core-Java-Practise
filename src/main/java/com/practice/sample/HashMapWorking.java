package com.practice.sample;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapWorking {

	public static void main(String[] args) {
		// LinkedHashMap<Integer, String> treeMap = new LinkedHashMap();
		//HashMap<Integer, String> treeMap = new HashMap<>();
		TreeMap<Student, String> hashMap = new TreeMap();

		String s1 = "s";

		/*
		 * We are stating from index 10 to make sure that hashCode values of
		 * Student object remains same and we get them in same bucket in HashMap
		 */
		/*
		 * for (int i = 10; i < 25; i++) { Student s = new Student(201701, s1 +
		 * i); hashMap.put(s, s.getStudentName()); }
		 */

		Student s4 = new Student(201701, s1 + 3);
		hashMap.put(s4, s4.getStudentName());

		Student s2 = new Student(201701, s1 + 2);
		hashMap.put(s2, s2.getStudentName());

		Student s3 = new Student(201701, s1 + 7);
		hashMap.put(s3, s3.getStudentName());

		Student s = new Student(201701, s1 + 5);
		hashMap.put(s, s.getStudentName());

		Set<Entry<Student, String>> entrySet = hashMap.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		/*treeMap.put(2, "A");
		treeMap.put(6, "B");
		treeMap.put(3, "J");
		treeMap.put(1, "D");

		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}*/

	}
}