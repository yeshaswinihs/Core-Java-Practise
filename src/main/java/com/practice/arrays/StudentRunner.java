package com.practice.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {

		Student pradeep = new Student("Pradeep", 97, 96, 100);
		Student jagath = new Student("Jagath", 97, 93, 100, 95);
		Student nithin = new Student("Nithin", 96, 99, 94, 100, 93);

		List<Student> students = new ArrayList<>();
		students.add(pradeep);
		students.add(jagath);
		students.add(nithin);

		pradeep.addNewMark(95);
		nithin.removeMarkAtIndex(2);

		byte a = 127;
		System.out.println(++a);
		/*
		 * while (a > 0) { a++; System.out.println(a); }
		 */

		for (Student student : students) {
			int number = student.getNumberOfMarks();
			int sum = student.getTotalSumOfMarks();
			int maximumMark = student.getMaximumMark();
			int minimumMark = student.getMinimumMark();
			BigDecimal average = student.getAverageMarks();
			System.out.println("Name: " + student.getName());
			System.out.println("Number of marks: " + number);
			System.out.println("Sum of marks: " + sum);
			System.out.println("Maximum mark: " + maximumMark);
			System.out.println("Minimum mark: " + minimumMark);
			System.out.println("Average: " + average);
			System.out.println();
		}

	}
}
