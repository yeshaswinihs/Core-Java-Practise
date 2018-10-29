package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student var1, Student var2) {
		return Integer.compare(var2.getId(), var1.getId());
	}
}

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student var1, Student var2) {
		return Integer.compare(var1.getId(), var2.getId());
	}
}

public class StudentCollectionRunnner {

	public static void main(String[] args) {
		Student jagath = new Student("Jagath", 12);
		Student pradeep = new Student("Pradeep", 11);
		Student nithin = new Student("Nithin", 13);

		List<Student> students = new ArrayList<>();
		students.add(jagath);
		students.add(pradeep);
		students.add(nithin);

		List<Integer> ids = new ArrayList<>();
		ids.add(12);
		ids.add(11);
		ids.add(13);

		for (Student student : students) {
			System.out.print(" - " + student.getId() + " - " + student.getName());
		}

		System.out.println("\nDefault");
		Collections.sort(students);
		for (Student student : students) {
			System.out.print(" - " + student.getId() + " - " + student.getName());
		}

		System.out.println("\nDescending");
		Collections.sort(students, new DescendingStudentComparator());
		for (Student student : students) {
			System.out.print(" - " + student.getId() + " - " + student.getName());
		}

		System.out.println("\nAscending");
		Collections.sort(students, new AscendingStudentComparator());
		for (Student student : students) {
			System.out.print(" - " + student.getId() + " - " + student.getName());
		}

		System.out.println("\nNew Impl");
		Student student = null;
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); System.out
				.print(" - " + student.getId() + " - " + student.getName())) {
			student = iterator.next();
		}

		System.out.println();
		for (Integer id : ids) {
			System.out.print(" - " + id);
		}

		System.out.println("\nSorting Integers");
		Collections.sort(ids);

		for (Integer id : ids) {
			System.out.print(" - " + id);
		}
	}
}
