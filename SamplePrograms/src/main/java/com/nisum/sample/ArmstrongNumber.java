package com.nisum.sample;

import java.util.*;

public class ArmstrongNumber {
	public static boolean is_Amstrong(int n) {
		int remainder, sum = 0, temp = 0;
		temp = n;
		while (n > 0) {
			remainder = n % 10;
			sum = sum + (remainder * remainder * remainder);
			n = n / 10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = s.nextLine();
		int number = Integer.parseInt(input);
		System.out.println("Armstrong number " + is_Amstrong(number));
	}
}