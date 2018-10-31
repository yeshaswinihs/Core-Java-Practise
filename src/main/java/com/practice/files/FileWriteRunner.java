package com.practice.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {

		Path filePathToWrite = Paths.get(".\\src\\main\\resources\\file-write.txt");

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		Files.write(filePathToWrite, list);

	}

}
