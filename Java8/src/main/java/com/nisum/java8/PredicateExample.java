package com.nisum.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateExample {
	public static void main(String args[]) {

		// create a list of strings to the predicate
		List<String> names = Arrays.asList("sai", "charan", "nisum", "chandan", "ram");

		// declare the predicate type as string and use
		// lambda expression to create object
		Predicate<String> p = (s) -> s.startsWith("s");

		// Iterate through the list
		for (String st : names) {
			// call the test method
			if (p.test(st))
				System.out.println(st);
		}
	}
}