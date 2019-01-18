package com.practice.sample;

public class OverLoadingRunner {

	public static void main(String[] args) {

		sum(new Integer(10));

		long a = 10;
		float b = 3;
		short c = 10;
		c = 10 + 1;

		Long l = 10L;
		Integer x = 500;
		Integer y = 500;
		System.out.println(x.equals(y));
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());

	}

	static void sum(int a) {
		System.out.println("int");
	}

	static void sum(Integer a) {
		System.out.println("Integer");
	}

}

class Apple {
	protected Object method() {
		System.out.println();
		return "String";
	}
}

class Ball extends Apple {
	
	@Override
	public String method() {
		System.out.println();
		return "String";
	}
}
