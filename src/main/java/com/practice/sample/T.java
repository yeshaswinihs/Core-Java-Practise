package com.practice.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class T {

	public static void main(String[] args) throws IOException {

		// int[] intArray = new int[-3];
		
		URL url = new URL("http://localhost:8080//book");

		URLConnection connection = url.openConnection();
		
		try (InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
				BufferedReader reader = new BufferedReader(inputStreamReader);) {

			System.out.println(reader.readLine());
			
		}

	}

}

