package com.practice.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
	}

}
