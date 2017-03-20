package com.java8.samples;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> persons = Arrays.asList("Raju,Haritha,Nihal,Balaji".split(","));
		persons.forEach(System.out::println);
		System.err.println("-----------------");
		persons.forEach(person -> System.out.println(person.toUpperCase()));
	}

}
