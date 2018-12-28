package com.practice.access;

/**
 * @author 734456
 *
 */
public class ExampleClass {

	private void privateMethod() {
	}

	public void publicMethod() {
	}

	protected void protectedMethod() {
	}

	void defaultMethod() {
	}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();

		exampleClass.defaultMethod();
		exampleClass.publicMethod();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
	}

}
