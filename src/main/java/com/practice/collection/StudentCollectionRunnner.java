package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

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

		// System.out.println(students);

		// Collections.sort(students);

		// System.out.println(students);

		Stream<Student> stream = students.stream();
		// stream.forEach(System.out::print);
		System.out.println("\nUsing Stream again");
		// stream.forEach(System.out::print);
		System.out.println();
		Stream.of("AAA", "BBB", "CCC").parallel().forEachOrdered(System.out::print);
		System.out.println();
		Stream.of("AAA", "BBB", "CCC").parallel().forEach(System.out::print);
		System.out.println();
		students.forEach(System.out::print);
		System.out.println();
		Iterator itr = students.iterator();
		itr.next();
		itr.forEachRemaining(System.out::print);
		System.out.println();
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
		System.out.println("ID Comparator");
		Collections.sort(students, new AscendingStudentComparator());
		for (Student student : students) {
			System.out.print(" - " + student.getId() + " - " + student.getName());
		}
		// Using Lambda
		// ID Comparator
		System.out.println("\nID Comparator using lambda");
		Collections.sort(students, (var1, var2) -> var1.getId() - var2.getId());
		for (Student student : students) {
			System.out.print(" - " + student.getId() + " - " + student.getName());
		}
		// Name Comparator
		System.out.println("\nName Comparator using lambda");
		Collections.sort(students, (var1, var2) -> var1.getName().compareTo(var2.getName()));
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
