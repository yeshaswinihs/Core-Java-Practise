package com.practice.dataStructures;

public class BasicStack<T> {

	private T[] data;
	private int stackPointer;

	public BasicStack() {
		data = (T[]) new Object[1000];
		stackPointer = 0;
	}

	public void push(T newItem) {
		data[stackPointer++] = newItem;
	}

	public T pop() {
		if (stackPointer == 0) {
			return null;
		}
		return data[--stackPointer];
	}

	public boolean contains(T item) {
		for (int i = 0; i < stackPointer; i++) {
			if (data[i].equals(item)) {
				return true;
			}
		}
		return false;
	}

	public T access(T item) {
		while (stackPointer > 0) {
			if (item.equals(pop())) {
				return item;
			}
		}
		return null;
	}

	public static void main(String[] args) {

	}

	public int size() {
		return stackPointer;
	}

}
