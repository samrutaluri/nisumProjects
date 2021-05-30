package com.nisum.sample;

public class WhiteSpacesRemoval {
	public static void main(String[] args) {
		String s = "Sai Charan Amrutaluri";
		System.out.println("Original : " + s);

		s = s.replaceAll("s+", "");

		System.out.println("After : " + s);
	}
}