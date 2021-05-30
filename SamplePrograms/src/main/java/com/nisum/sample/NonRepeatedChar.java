package com.nisum.sample;

import java.util.Scanner;

public class NonRepeatedChar {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = s.next();
		char[] arr = new char[str.length()];
		for (int j = 0; j < arr.length; j++) {
			arr[j] = str.charAt(j);
		}
		char found = searchchar(str, arr);
		System.out.println("The first non repeated char is " + found);
	}

	public static char searchchar(String a, char[] b) {
		int i = 0;
		while (i != a.length()) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (i != j) {
					if (a.charAt(i) != b[j]) {
						count++;
					}
				}
				if (count == a.length() - 1) {
					return a.charAt(i);
				}
			}
			i++;
		}
		return 0;
	}
}
