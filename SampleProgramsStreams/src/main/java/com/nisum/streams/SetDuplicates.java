package com.nisum.streams;

import java.util.HashSet;

public class SetDuplicates {
	public static void main(String args[]) {
		HashSet<String> hset = new HashSet<String>();

		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");

		// Displaying HashSet elements
		System.out.println(hset);
	}
}