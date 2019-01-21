package com.practice.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class AdvancedStack<T> implements IAdvancedStack<T> {

	private List<T> data;
	private int stackPointer;

	public AdvancedStack() {
		data = new ArrayList<>();
	}

	public void push(T newItem) {
		data.add(newItem);
		stackPointer++;
	}

	public T pop(){
		if (stackPointer == 0) {
			return null;
		}
		return data.remove(--stackPointer);
	}

	public boolean contains(T item) {
		return data.contains(item);
	}

	public T access(T item) {
		while (stackPointer > 0) {
			if (item.equals(pop())) {
				return item;
			}
		}

		return null;
	}

	public int size() {
		return stackPointer;
	}


}
