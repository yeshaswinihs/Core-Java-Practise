package com.practice.hackerRank;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();

	}

	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = i + 1; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
