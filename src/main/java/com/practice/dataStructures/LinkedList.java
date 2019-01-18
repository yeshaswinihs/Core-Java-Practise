package com.practice.dataStructures;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	LinkedList insertNode(LinkedList list, int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node currentNode = list.head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}

		return list;
	}

	void printList(LinkedList list) {
		Node currentNode = list.head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	private void deleteNodeByKey(LinkedList list, int key) {

		Node currentNode = list.head;
		Node previousNode = null;
		boolean keyFound = false;
		if (currentNode.data == key) {
			list.head = currentNode.next;
			keyFound = true;
		} else {
			while (currentNode != null && currentNode.data != key) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			if (currentNode != null && currentNode.data == key) {
				previousNode.next = currentNode.next;
				keyFound = true;
			}
		}

		if (keyFound) {
			System.out.println("Successfully deleted key: " + key + " from the list..");
		} else {
			System.out.println("Key not found!!");
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insertNode(list, 1);
		list.insertNode(list, 2);
		list.insertNode(list, 5);
		list.insertNode(list, 4);
		list.insertNode(list, 7);
		list.insertNode(list, 8);
		list.insertNode(list, 3);

		list.printList(list);

		list.deleteNodeByKey(list, 1);
		System.out.println("List after deleting head");
		list.printList(list);
		list.deleteNodeByKey(list, 5);
		System.out.println("List after deleting key 5");
		list.printList(list);
		System.out.println("Deleting key 5 again");
		list.deleteNodeByKey(list, 5);
	}

}
