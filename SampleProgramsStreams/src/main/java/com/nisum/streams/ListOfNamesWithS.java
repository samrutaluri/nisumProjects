package com.nisum.streams;

import java.io.IOException;
import java.util.Arrays;

public class ListOfNamesWithS {
	public static void main(String[] args) throws IOException {
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sai", "Saranya", "Hans", "Shivika", "rahul" };
		Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);
	}
}