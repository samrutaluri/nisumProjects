package com.nisum.sample;

public class SecondLargest {
	public static void main(String args[]) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		int n = SecondHighest(arr1);
		System.out.println("Second highest element  : " + n);
	}

	public static int SecondHighest(int array[]) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {

				secondHighest = highest;

				highest = array[i];
			} else if (array[i] > secondHighest && array[i] != highest)
				secondHighest = array[i];
		}

		return secondHighest;
	}
}