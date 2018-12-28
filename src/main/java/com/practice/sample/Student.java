package com.practice.sample;

public class Student implements Comparable<Student> {
	private int studentRollNo;

	private String studentName;

	public Student(int studentId, String studentName) {
		super();
		this.studentRollNo = studentId;
		this.studentName = studentName;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + "]";
	}

	@Override
	public int compareTo(Student that) {
		return this.studentName.compareTo(that.studentName);
	}

}