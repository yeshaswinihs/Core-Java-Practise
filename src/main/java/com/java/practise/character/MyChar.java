package com.java.practise.character;

public class MyChar {

	private char c;
	
	MyChar(char c) {
		this.c = c;
	}

	public boolean isDigit() {
		if (this.c >=48 && this.c<=57){
				return true;
			} else {
				return false;	
			}
	}

	public boolean isAlphabet() {
		if ((this.c >=65 && this.c<=90)||(this.c >=97 && this.c<=122)){
			return true;
		} else {
			return false;	
		}
	}

	public boolean isVowel() {
		if (this.c == 'a'||this.c == 'e'||this.c == 'i'||this.c == 'o'||this.c == 'u'
			|| this.c == 'A'||this.c == 'E'||this.c == 'I'||this.c == 'O'||this.c == 'U'){
			return true;
		} else {
			return false;	
		}
	}

	public void printLowerCaseAlphabets() {
		System.out.println();
		
	}

	public void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		
	}

	public boolean isConsonant() {
		if (this.isAlphabet()){
			if (this.isVowel())
				return false;
			else 
				return true;
		} else {
			return false;	
		}
	}
}
