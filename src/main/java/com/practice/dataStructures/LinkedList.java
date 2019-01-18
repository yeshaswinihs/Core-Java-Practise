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

		// Check if list is empty
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
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();

	}

	private void deleteNodeByValue(LinkedList list, int value) {

		Node currentNode = list.head;
		Node previousNode = null;
		boolean valueFound = false;
		if (currentNode.data == value) {
			list.head = currentNode.next;
			valueFound = true;
		} else {
			while (currentNode != null && currentNode.data != value) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			if (currentNode != null && currentNode.data == value) {
				previousNode.next = currentNode.next;
				valueFound = true;
			}
		}

		if (valueFound) {
			System.out.println("Successfully deleted value: " + value + " from the list..");
		} else {
			System.out.println("Value not found!!");
		}
	}

	private void deleteNodeByIndex(LinkedList list, int index) {

		Node currentNode = list.head;
		Node previousNode = null;
		int counter = 0;

		if (index == 0) {
			list.head = currentNode.next;
		} else {
			while (currentNode != null && counter != index) {
				previousNode = currentNode;
				currentNode = currentNode.next;
				counter++;
			}

			if (currentNode != null) {
				previousNode.next = currentNode.next;
				System.out.println("Element at index: " + index + " deleted succesfully..");
			} else {
				System.out.println("Index out of bound!!");
			}

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

		list.deleteNodeByValue(list, 1);
		System.out.println("List after deleting head");
		list.printList(list);
		list.deleteNodeByValue(list, 5);
		System.out.println("List after deleting value 5");
		list.printList(list);
		System.out.println("Deleting value 5 again");
		list.deleteNodeByValue(list, 5);
		list.printList(list);
		System.out.println("Deleting element at index 3");
		list.deleteNodeByIndex(list, 3);
		list.printList(list);
		System.out.println("Deleting element at index 5");
		list.deleteNodeByIndex(list, 5);
		list.printList(list);
	}

}
