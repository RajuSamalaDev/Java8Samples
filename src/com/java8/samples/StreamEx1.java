/**
 * 
 */
package com.java8.samples;

import java.util.*;

public class StreamEx1 {
	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		List<String> uppercaseNames = new ArrayList<String>();

		// Using Lambda, forEach(), map() method in Stream interface in Java 8
		friends.stream().map(name -> name.toUpperCase()).forEach(name -> uppercaseNames.add(name));
		System.out.println(uppercaseNames);
		uppercaseNames.clear();

		friends.stream().map(name -> {
			uppercaseNames.add(name.toUpperCase());
			return name;
		});
		System.out.println(uppercaseNames);
		uppercaseNames.clear();

		// startsWithN =
		// friends.stream().filter(name->name.startsWith("N")).collect(Collectors.toList());
	}
}
