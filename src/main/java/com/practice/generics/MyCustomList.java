package com.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {

	List<T> list = new ArrayList<>();

	public void addElement(T value) {
		list.add(value);
	}

	public void removeElement(int index) {
		list.remove(index);
	}

	public T getElement(int index) {
		return list.get(index);
	}

}
