package com.practise.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {

	List<T> list = new ArrayList<>();

	public void addElement(T value) {
		list.add(value);
	}

}
