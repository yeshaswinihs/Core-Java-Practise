package com.practice.access.package2;

final class FinalClass {

}
// Final Class cannot be extended
// class SomeClass extends FinalClass {

// }

class SomeClass {
	final public void doSomething() {
	}
}

// Final Methods cannot be overridden
class ExtendingClass extends SomeClass {
	// @Override
	// public void doSomething() { }
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		final int i = 5, j;
		// final variable value cannot be changed
		// i = 7;
		// Value can be assigned only once if it is not initialized
		j = 7;
		// j=9;

	}

}
