package com.nisum.sample;

import java.util.Scanner;

class SquareRoot {

	static boolean checkPerfectSquare(double x) {

		double sq = Math.sqrt(x);

		return ((sq - Math.floor(sq)) == 0);
	}

	public static void main(String[] args) {
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		scanner.close();

		if (checkPerfectSquare(num))
			System.out.print(num + " perfect square ");
		else
			System.out.print(num + " not a perfect square ");
	}
}