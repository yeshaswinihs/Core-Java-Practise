package com.practice.character;

public class MyCharRunner {

	public static void main(String[] args) throws InterruptedException {
		MyChar myChar = new MyChar('6');

		System.out.println("isVowel: " + myChar.isVowel());
		System.out.println("isConsonant: " + myChar.isConsonant());
		System.out.println("isDigit: " + myChar.isDigit());
		System.out.println("isAlphabet: " + myChar.isAlphabet());

		myChar.printLowerCaseAlphabets();
		System.out.println();
		myChar.printUpperCaseAlphabets();

		Thread.sleep(500);

	}

}
