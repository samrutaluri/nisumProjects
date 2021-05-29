package com.nisum.sample;

import java.util.Scanner;

public class GCD {
	private static Scanner s;

	public static void main(String[] args) {
		int n1, n2, i, GCD = 0;
		s = new Scanner(System.in);

		System.out.print(" First Value : ");
		n1 = s.nextInt();

		System.out.print(" Second Integer : ");
		n2 = s.nextInt();

		for (i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				GCD = i;
			}
		}
		System.out.println("\n GCD of " + n1 + " and " + n2 + "  =  " + GCD);
	}
}