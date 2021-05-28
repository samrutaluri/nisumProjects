package com.nisum.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateExample {
	public static void main(String args[]) {

		List<String> names = Arrays.asList("sai", "charan", "nisum", "chandan", "ram");

		Predicate<String> p = (s) -> s.startsWith("s");

		for (String st : names) {

			if (p.test(st))
				System.out.println(st);
		}
	}
}