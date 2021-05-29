package com.nisum.sample;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(" " + fact);
	}
}