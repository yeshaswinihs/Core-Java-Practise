package com.practice.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// Queue<String> animals = new PriorityQueue<>(new
		// StringLengthComparator());
		
		Queue<String> animals = new PriorityQueue<>((var1, var2) -> Integer.compare(var1.length(), var2.length()));
		
		// Queue<String> animals = new PriorityQueue<>();
		animals.add("Dog");
		animals.add("Zebra");
		animals.add("Horse");
		animals.add("Monkey");
		System.out.println(animals);
		System.out.println(animals.poll());
		System.out.println(animals.poll());
		System.out.println(animals.poll());
		System.out.println(animals.poll());

		Queue<Employee> employees = new PriorityQueue<>();
		employees.offer(new Employee(1, "Pradeep"));
		employees.offer(new Employee(3, "Nithin"));
		employees.offer(new Employee(2, "Jagath"));

		System.out.println(employees);
		System.out.println(employees.poll());
		System.out.println(employees.poll());
		System.out.println(employees.poll());

	}
}

class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee that) {
		return Integer.compare(this.id, that.id);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
