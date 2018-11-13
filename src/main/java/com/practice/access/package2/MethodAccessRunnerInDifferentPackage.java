package com.practice.access.package2;

import com.practice.access.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();

		// exampleClass.defaultMethod();
		exampleClass.publicMethod();
		// exampleClass.privateMethod();
		// exampleClass.protectedMethod();

	}

}
