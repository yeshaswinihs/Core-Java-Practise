package com.practice.collection;

public class Student extends Object implements Comparable<Student> {

	private int id;
	private String name;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
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
	public int compareTo(Student that) {
		return Integer.compare(that.id, this.id);
	}

}
