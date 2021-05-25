package com.nisum.string;

public class StringBufferAndStringBuilder {
	public static void concat1(String s1) {
		s1 = s1 + "Sai Charan";
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append("Sai Charan");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append("Sai Charan");
	}

	public static void main(String[] args) {
		String s1 = "Balu";

		// s1 is not changed
		concat1(s1);
		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("Geeks");

		// s2 is changed
		concat2(s2);
		System.out.println("StringBuilder: " + s2);

		StringBuffer s3 = new StringBuffer("Balu");

		// s3 is changed
		concat3(s3);
		System.out.println("StringBuffer: " + s3);
	}
}
