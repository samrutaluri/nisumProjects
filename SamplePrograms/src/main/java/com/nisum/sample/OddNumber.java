package com.nisum.sample;

import java.util.Scanner;

public class OddNumber {

	public static boolean isOdd(int n) {

		if (n % 2 != 0)
			return true;

		return false;
	}

	public static void main(String[] args) {
		int number = 0;
		boolean result = false;
		Scanner scan = new Scanner(System.in);    //  create Scanner class object to take input
		System.out.print("Enter number:: ");
		number = scan.nextInt();
		result = isOdd(number);
		if (result)
			System.out.println(number + " is an odd number");
		else
			System.out.println(number + " is not an odd number");

		scan.close();
	}
}
