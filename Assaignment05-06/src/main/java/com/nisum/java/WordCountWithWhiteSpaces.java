package com.nisum.java;

import java.util.Scanner;

class WordCountWithWhiteSpaces {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		String str = "Iam Sai Charan";
		char[] len = str.toCharArray();
		int a = 0;
		for (char ch : len) {
			a++;
		}
		System.out.println("Length of a string is :" + a);

	}
}