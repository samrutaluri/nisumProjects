package com.nisum.sample;

public class SwapNumbers {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		System.out.println("Before swap");
		System.out.println(" x is :" + x);
		System.out.println(" y is :" + y);

		swap(x, y);
	}

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swap");
		System.out.println(" x is :" + x);
		System.out.println(" y is :" + y);
	}
}