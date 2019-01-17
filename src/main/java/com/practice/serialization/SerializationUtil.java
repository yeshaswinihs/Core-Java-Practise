package com.practice.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {

	public static void serialize(Object object, String fileName) throws FileNotFoundException, IOException {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
			objectOutputStream.writeObject(object);
		}
	}

	public static Object deserialize(String fileName)
			throws IOException, FileNotFoundException, ClassNotFoundException {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
			return objectInputStream.readObject();
		}
	}

}
