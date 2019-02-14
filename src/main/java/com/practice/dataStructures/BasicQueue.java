package com.practice.dataStructures;

public class BasicQueue<T> {

	private T[] data;
	private int front;
	private int end;

	public BasicQueue() {
		data = (T[]) new Object[1000];
		front = -1;
		end = -1;
	}

	public int size() {
		if (front == -1 && end == -1) {
			return 0;
		}
		return end - front + 1;
	}

	public void enQueue(T newItem) {

		if (size() % data.length == 0) {
			throw new IllegalStateException("Queue is full!");
		} else if (size() == 0) {
			front++;
			end++;
		} else {
			end++;
		}
		data[end] = newItem;

	}

	public T deQueue() {

		if (size() == 0) {
			throw new IllegalStateException("Queue is full!");
		} else if (front == end) {
			front = -1;
			end = -1;
			return data[end + 1];
		} else {
			return data[front++];
		}
	}

}
