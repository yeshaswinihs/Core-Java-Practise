package com.practice.immutable;

public class ImmutableRunner {

	public static void main(String[] args) {
		
		MutableClass  mutableInstance = new MutableClass(1, "Mutable Class");
		ImmutableClass immutableClass = new ImmutableClass(2, "Immutable Class", mutableInstance);

		System.out.println("immutableClass -> " + immutableClass);

		mutableInstance.setName("Mutable Class Updated");

		System.out.println("immutableClass after updating -> " + immutableClass);

	}

}
