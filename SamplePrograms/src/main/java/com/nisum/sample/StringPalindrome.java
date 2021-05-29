package com.nisum.sample;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "MADAM";
		if (isPalindrome(s)) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is NOT a palindrome");
		}
	}

	public static boolean isPalindrome(String s) {

		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equalsIgnoreCase(reverse)) {
			return true;
		} else {
			return false;
		}
	}

}