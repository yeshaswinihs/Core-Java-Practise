package com.practice.threads;

import java.util.LinkedList;
import java.util.List;

public class CustomBlockingQueue<T> {

	public static void main(String[] args) throws InterruptedException {

		int capacity = 5;

		CustomBlockingQueue<String> queue = new CustomBlockingQueue(capacity);

		queue.enqueue("StarWars");
		queue.enqueue("SuperMan");
		queue.enqueue("Flash");
		queue.enqueue("BatMan");
		queue.enqueue("Avengers");

		
		
		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
		queue.dequeue();
		queue.dequeue();

		
		queue.enqueue("CaptainAmerica");
		queue.enqueue("Thor");

		System.out.println("queue contains " + queue);
	}

	private List<T> queue = new LinkedList<T>();
	private int limit = 10;

	public CustomBlockingQueue(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(T item) throws InterruptedException {
		while (this.queue.size() == this.limit) {
			wait();
		}
		this.queue.add(item);
		if (this.queue.size() == 1) {
			notifyAll();
		}
	}

	public synchronized Object dequeue() throws InterruptedException {
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}

		return this.queue.remove(0);
	}
}