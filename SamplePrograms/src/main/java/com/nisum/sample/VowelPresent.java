package com.nisum.sample;

import java.util.Scanner;

public class VowelPresent {
	public static void main(String args[]) {
		int count = 0;
		System.out.println("Enter :");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowels " + count);
	}
}