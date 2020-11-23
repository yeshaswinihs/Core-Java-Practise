package com.practice.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueMain {
	public static void main(String[] args) throws InterruptedException {

		// define capacity of ArrayBlockingQueue
		int capacity = 5;

		// create object of ArrayBlockingQueue
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);

		// Add elements to ArrayBlockingQueue using put
		// method
		queue.put("StarWars");
		queue.put("SuperMan");
		queue.add("Flash");
		queue.put("BatMan");
		queue.offer("Avengers");

		// print Queue
		System.out.println("queue contains " + queue);

		// remove some elements
		queue.remove();
		queue.poll();
		queue.take();

		// Add elements to ArrayBlockingQueue
		// using put method
		queue.put("CaptainAmerica");
		queue.put("Thor");

		System.out.println("queue contains " + queue);
	}

//	OPERATION  	THROWS EXCEPTION	SPECIAL VALUE	  BLOCKS	    TIMES OUT
//	Insert 	     add(e) 	        offer(e) 	     put(e) 		offer(e, time, unit)
//	Remove	     remove() 	        poll() 	         take() 		poll(time, unit)
//	Examine 	element() 	        peek()         	not applicable 	not applicable
}
