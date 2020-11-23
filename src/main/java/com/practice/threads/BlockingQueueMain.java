package com.practice.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueMain {

	public static void main(String args[]) {
		BlockingQueueMain blockingQueueMain = new BlockingQueueMain();
		BlockingQueue queue = new ArrayBlockingQueue(10);
		Producer producer = blockingQueueMain.new Producer(queue);
		Consumer consumer = blockingQueueMain.new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}

	public class Producer implements Runnable {

		BlockingQueue queue = null;

		public Producer(BlockingQueue queue) {
			super();
			this.queue = queue;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 50; i++) {
				System.out.println("Produced item " + i);
				try {
					queue.put("item " + i);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		}

	}

	public class Consumer implements Runnable {

		BlockingQueue queue = null;

		public Consumer(BlockingQueue queue) {
			super();
			this.queue = queue;
		}

		@Override
		public void run() {

			while (true) {
				try {
					System.out.println("Consumed " + queue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
