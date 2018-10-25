package com.practise.oops;

public class Student extends Person {

	private String college;
	private String year;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [college=" + college + ", year=" + year + "]";
	}
}
