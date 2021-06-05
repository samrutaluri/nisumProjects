package com.nisum.java;

public class IntersectionTwoArrays {
	public static void main(String args[]) {
		int Arr1[] = { 23, 36, 96, 78, 55 };
		int Arr2[] = { 78, 45, 19, 73, 55 };
		System.out.println("Intersection of the two arrays ::");

		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr2.length; j++) {
				if (Arr1[i] == Arr1[j]) {
					System.out.println(Arr2[j]);
				}
			}
		}
	}

// using java 8

	/*
	 * import java.util.Arrays; import java.util.HashSet;
	 * 
	 * public class IntersectionTwoArrays { public static void main(String[] args) {
	 * Integer[] firstArray = { 23, 36, 96, 78, 55 }; Integer[] secondArray = { 78,
	 * 45, 19, 73, 55 };
	 * 
	 * HashSet<Integer> set = new HashSet<>();
	 * 
	 * set.addAll(Arrays.asList(firstArray));
	 * 
	 * set.retainAll(Arrays.asList(secondArray));
	 * 
	 * System.out.println(set);
	 * 
	 * Integer[] intersection = {}; intersection = set.toArray(intersection);
	 * 
	 * System.out.println(Arrays.toString(intersection)); }
	 */
}