package com.practice.character;

public class MyChar {

	private char c;

	MyChar(char c) {
		this.c = c;
	}

	public boolean isDigit() {
		if (this.c >= 48 && this.c <= 57) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAlphabet() {
		if (this.c >= 65 && this.c <= 90 || this.c >= 97 && this.c <= 122) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isVowel() {
		if (this.c == 'a' || this.c == 'e' || this.c == 'i' || this.c == 'o' || this.c == 'u' || this.c == 'A'
				|| this.c == 'E' || this.c == 'I' || this.c == 'O' || this.c == 'U') {
			return true;
		} else {
			return false;
		}
	}

	public void printUpperCaseAlphabets() {
		for (char ch = 65; ch <= 90; ch++) {
			System.out.print(ch + " ");
		}
	}

	public void printLowerCaseAlphabets() {
		for (char ch = 97; ch <= 122; ch++) {
			System.out.print(ch + " ");
		}
	}

	public boolean isConsonant() {
		if (this.isAlphabet() && !this.isVowel()) {
			return true;
		} else {
			return false;
		}
	}
}
