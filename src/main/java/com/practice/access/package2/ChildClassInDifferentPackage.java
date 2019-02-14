package com.practice.access.package2;

import com.practice.access.package1.ExampleClass;

public class ChildClassInDifferentPackage extends ExampleClass {

	public static void main(String[] args) {

		ExampleClass exampleClass = new ExampleClass();
		exampleClass.c = 3;
		exampleClass.publicMethod();

		ChildClassInDifferentPackage childClassInstance = new ChildClassInDifferentPackage();
		childClassInstance.b = 4;
		childClassInstance.c = 6;
		childClassInstance.publicMethod();
		childClassInstance.protectedMethod();

		ExampleClass instance = new ChildClassInDifferentPackage();


	}

	public void accessProtectedMembers() {
		protectedMethod();
		b = 5;

	}

}
