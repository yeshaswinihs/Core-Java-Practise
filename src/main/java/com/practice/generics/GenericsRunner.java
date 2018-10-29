package com.practice.generics;

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

	}

}
