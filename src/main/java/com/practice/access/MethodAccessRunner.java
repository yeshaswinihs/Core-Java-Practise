package com.practice.access;

public class MethodAccessRunner {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();

		exampleClass.defaultMethod();
		exampleClass.publicMethod();
		// exampleClass.privateMethod();
		exampleClass.protectedMethod();

	}

}
