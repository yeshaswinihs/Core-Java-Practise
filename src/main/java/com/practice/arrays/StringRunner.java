package com.practice.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String max = days[0];
		for (String day : days) {
			if (day.length() > max.length()) {
				max = day;
			}
		}
		System.out.println("Day with max length: " + max);

		for (int i = days.length - 1; i >= 0; i--) {
			System.out.print(days[i] + " ");
		}

	}

}
