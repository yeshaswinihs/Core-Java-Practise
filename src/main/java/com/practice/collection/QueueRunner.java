package com.practice.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> animals = new PriorityQueue<>(new StringLengthComparator());
		animals.add("Dog");
		animals.add("Zebra");
		animals.add("Horse");
		animals.add("Monkey");
		System.out.println(animals);
		System.out.println(animals.poll());
		System.out.println(animals.poll());
		System.out.println(animals.poll());
		System.out.println(animals.poll());

	}
}
