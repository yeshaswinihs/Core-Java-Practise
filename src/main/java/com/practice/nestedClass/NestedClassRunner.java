package com.practice.nestedClass;

class DefaultClass {

}

public class NestedClassRunner {

	int i;

	static int k = 5;

	class InnerClass {

		public void method() {
			i = 5;
			k++;
		}

	}

	static class StaticNestedClass {
		public void method() {
			// i = 5; - Not allowed
		}
	}

	public static void main(String[] args) {
		// Cannot be instantiated directly
		// InnerClass innerClass = new InnerClass();

		// Can be instantiated directly
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner();

		InnerClass innerClass = nestedClassRunner.new InnerClass();

	}

}
