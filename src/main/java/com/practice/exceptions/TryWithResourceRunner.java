package com.practice.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceRunner {

	public static void main(String[] args) throws IOException {
		try (Scanner scanner = new Scanner(System.in)) {
			String str = scanner.next();
			System.out.println("Input:" + str);
		}
	}

}
