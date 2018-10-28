package com.practise.generics;

import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {
		
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		
		System.out.println(list.getElement(0));
		
		MyCustomList<Integer> numberList = new MyCustomList<>();
		numberList.addElement(1);
		numberList.addElement(2);
		
		System.out.println(numberList.getElement(0));
		
		List<Integer> streamList = List.of(1,4,7,9);
		int sum = streamList.stream().reduce( 0, (num1,num2) -> num1 + num2);
		int sumOfOdd = streamList.stream().filter(num ->  num%2==1).reduce( 0, (num1,num2) -> num1 + num2);
		System.out.println("Sum: "+sum+", Sum of odd:"+sumOfOdd);
		
	}

}
