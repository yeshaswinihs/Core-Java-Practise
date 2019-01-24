package com.practice.access;

/**
 * @author 734456
 *
 */
public class MethodAccessRunner {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();

		exampleClass.defaultMethod();
		exampleClass.publicMethod();
		// exampleClass.privateMethod();
		exampleClass.protectedMethod();

	}

}
