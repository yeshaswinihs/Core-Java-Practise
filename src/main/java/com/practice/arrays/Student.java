package com.practice.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;

	private ArrayList<Integer> marks = new ArrayList<>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public String getName() {
		return name;
	}

	public int getNumberOfMarks() {

		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 3, RoundingMode.CEILING);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}
}
