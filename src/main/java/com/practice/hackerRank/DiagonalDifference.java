package com.practice.hackerRank;

import java.io.IOException;
import java.util.Scanner;

/*
 * 	Sample Input

	3
	11 	2 	4
	4 	5 	6
	10 	8 	-12
	
	Sample Output

	15
	
	Explanation
	
	Sum across the primary diagonal: 11 + 5 - 12 = 4

	Sum across the secondary diagonal: 4 + 5 + 10 = 19 

	Difference: |4 - 19| = 15

	Note: |x| is the absolute value of x
*/
public class DiagonalDifference {

	static int diagonalDifference(int[][] arr) {
		int primaryDiagonalsum = 0;
		int secondaryDiagonalsum = 0;
		// Using 2 variables at a time, so that only single loop can be used
		for (int i = 0, j = 0; i < arr.length && j < arr.length; i++, j++) {
			primaryDiagonalsum += arr[i][j];
		}
		for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
			secondaryDiagonalsum += arr[i][j];
		}
		return Math.abs(primaryDiagonalsum - secondaryDiagonalsum);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);

		System.out.println("Result: " + result);

		scanner.close();
	}
}