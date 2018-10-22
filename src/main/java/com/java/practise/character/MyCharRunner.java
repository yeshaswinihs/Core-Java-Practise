package com.java.practise.character;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('6');
		
		
		System.out.println("isVowel: "+myChar.isVowel());
		System.out.println("isConsonant: "+myChar.isConsonant());
		System.out.println("isDigit: "+myChar.isDigit());
		System.out.println("isAlphabet: "+myChar.isAlphabet());
		
		//myChar.printLowerCaseAlphabets();
		//myChar.printUpperCaseAlphabets();
		

	}

}
