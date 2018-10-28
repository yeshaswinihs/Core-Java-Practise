package com.practise.functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPRunner {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,4,7,9);
		
		IntStream.range(0, 10).map(element -> element*element).forEach(element -> System.out.println(element));
		
		List.of("Apple","Ant","Bat").stream().map( element -> element.toLowerCase()).forEach(element -> System.out.println(element));
		
		List.of("Apple","Ant","Bat").stream().map( element -> element.length()).forEach(element -> System.out.println(element));
		
	}

}
