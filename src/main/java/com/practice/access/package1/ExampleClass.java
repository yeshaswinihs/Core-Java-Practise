package com.practice.access.package1;

import java.io.Serializable;

/**
 * @author 734456
 *
 */
public class ExampleClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a;
	protected int b;
	public int c;
	int d;

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
