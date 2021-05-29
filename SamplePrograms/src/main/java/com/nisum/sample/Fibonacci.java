package com.nisum.sample;

public class Fibonacci {

	public static void main(String args[]) {
		int a, b, c, n;
		a = 1;
		b = 1;
		for (n = 1; n < 10; n++) {
			System.out.println("" + a);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
