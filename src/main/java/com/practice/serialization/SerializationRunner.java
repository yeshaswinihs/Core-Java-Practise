package com.practice.serialization;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SerializationRunner {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		String fileName = "TestSerialization.ser";

		// Employee pradeep = new Employee("Pradeep", 1, "dummy", 10000);

		// SerializationUtil.serialize(pradeep, fileName);

		Employee employee = (Employee) SerializationUtil.deserialize(fileName);

		// System.out.println(pradeep);

		System.out.println(employee);


	}

}
