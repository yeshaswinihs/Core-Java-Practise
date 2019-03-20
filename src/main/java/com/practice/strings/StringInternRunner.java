package com.practice.strings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class StringInternRunner {

	public static void main(String[] args) {
		System.out.println("\n-----String Intern---------\n");

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");// .intern();
		String str4 = new String("Hello").intern();

		System.out.print("str3==str4 -> ");
		System.out.println(str3 == str4);

		System.out.print("str1==str2 -> ");
		System.out.println(str1 == str2);

		System.out.print("str1==str4 -> ");
		System.out.println(str1 == str4);

		System.out.print("str2==str4 -> ");
		System.out.println(str2 == str4);

		System.out.println();

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		System.out.println();

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));


		Employee emp2 = new Employee("DEF", 124);
		Employee emp3 = new Employee("DEF", 124);
		Employee emp1 = new Employee("ABC", 123);

		System.out.println();
		System.out.println(emp1.hashCode());
		System.out.println(System.identityHashCode(emp1));

	}


}

@Getter
@Setter
class Employee {

	private String name;
	private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}
